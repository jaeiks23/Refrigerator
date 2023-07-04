package com.refrigerator.springboot.controller;

import com.refrigerator.springboot.constant.LoginType;
import com.refrigerator.springboot.dto.*;
import com.refrigerator.springboot.entity.*;
import com.refrigerator.springboot.repository.*;
import com.refrigerator.springboot.service.InsertService;
import com.refrigerator.springboot.service.RecipeApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Controller
@RequiredArgsConstructor
@RequestMapping("/refrigeratorRecipe")
public class RecipeController {
    private final RecipeApiService recipeApiService;
    private final InsertService insertService;
    private final TagRepository tagRepository;
    private final MemberRepository memberRepository;
    private final RecipeBoardRepository recipeBoardRepository;
    private final RecipeContentRepository recipeContentRepository;
    private final RecipeIngedientRepository recipeIngedientRepository;
    private final IngRepositoryCusImp ingRepositoryCusImp;
    private final RefRepository refRepository;
    @GetMapping(value ="/")
    public String recipe(HttpServletRequest request ,Model model,Principal principal){
        Member member = Member.guestMem();
        MemberDto dto = (MemberDto) request.getSession().getAttribute("user");
        if(dto==null && principal.getName()==null){
            return "redirect:/loginCheck";
        }
        else {
            if(dto == null){
                member = memberRepository.findByEmailAndLoginType(principal.getName(), LoginType.NOMAL);
            }
            else{
                member = memberRepository.findByEmailAndLoginType(dto.getEmail(),dto.getLoginType());
            }



            Refrigerator refrigerator = refRepository.findByMember_Id(member.getId());
            List<IngreBigDto> inglist =insertService.getAllIng(refrigerator.getId());
            List<BigTags> biList = insertService.getBiList();
            List<RecipeApiDTO3> recipeApiDTO3s= new ArrayList<>();
            List<RecipeApiDTO> recipeLists = recipeApiService.getRecipeData();
            List<RecipeBoard> recipeBoards = recipeBoardRepository.findAllByDelCheckIsN();
            for(int i =0;i<recipeLists.size();i++){
                RecipeApiDTO3 dto3 = new RecipeApiDTO3(recipeLists.get(i));
                String[] count = recipeLists.get(i).getRcp_part().split(",");
                dto3.setCount_str(0+"/"+count.length);
                recipeApiDTO3s.add(dto3);
            }

            for(RecipeBoard recipeBoard : recipeBoards) {
                RecipeApiDTO3 recipeApiDTO3 = new RecipeApiDTO3();
                String content = "";
                String ingredient = "";
                int num = 1;
                List<RecipeContent> recipeContents = recipeContentRepository.findByRecipeContent(recipeBoard);
                List<RecipeIngredient> recipeIngredients = recipeIngedientRepository.findByrecipeBoard(recipeBoard);
                for(RecipeContent recipeContent : recipeContents) {
                    content += num+". "+recipeContent.getContent()+"+";
                    num++;
                }
                for(RecipeIngredient recipeIngredient : recipeIngredients) {
                    ingredient += recipeIngredient.getIngrediant()+"("+recipeIngredient.getIngrediantVol()+"),";
                }
                recipeApiDTO3.setId(recipeBoard.getWritingid());
                recipeApiDTO3.setRep_nm(recipeBoard.getTitle());
                recipeApiDTO3.setInfo_eng(Integer.toString(recipeBoard.getKcal()));
                recipeApiDTO3.setManual(content);
                recipeApiDTO3.setRcp_part(ingredient);
                String[] count = ingredient.split(",");
                recipeApiDTO3.setCount_str(0+"/"+count.length);
                recipeApiDTO3s.add(recipeApiDTO3);
            }

            System.out.println(recipeLists.size());
            model.addAttribute("member", member);
            model.addAttribute("recipeLists",recipeApiDTO3s);
            model.addAttribute("IngList",inglist);
            model.addAttribute("biList",biList);

            return "refrigeratorRecipe/recipe";
        }
    }
    @PostMapping(value = "/ing")
    public @ResponseBody ResponseEntity ingDetaisl(@RequestBody List<String> ids, Model model){


        List<RecipeApiDTO3> recipeLists = recipeApiService.getRecipeDatas(ids);
        List<String> slists2 = new ArrayList<>();

        for(String s: ids) {
            String s1 = ingRepositoryCusImp.getIngs2(s).getSmallTag().getTag_small_name();
            slists2.add(s1);
        }
        HashSet<String>Hlist = new HashSet<>(slists2);
        List<String>sslist = new ArrayList<>(Hlist);
        for(int i =0;i<recipeLists.size();i++){
            int count=0;
            for(String s1: sslist) {

                if (recipeLists.get(i).getRcp_part().indexOf(s1) != -1) {
                    count++;
                }
            }
            String[] slist = recipeLists.get(i).getRcp_part().split(",");
            recipeLists.get(i).setCount_str(count+"/"+ slist.length);
            recipeLists.get(i).setCount(count);
        }


        return  new ResponseEntity<List<RecipeApiDTO3>>(recipeLists,HttpStatus.OK);
    }
    @PostMapping(value = "/ing/selects")
    public @ResponseBody ResponseEntity selectx( Model model,HttpServletRequest request,Principal principal){

        MemberDto dto = (MemberDto) request.getSession().getAttribute("user");
        Member member = new Member();
        if(dto == null){
            member = memberRepository.findByEmailAndLoginType(principal.getName(),LoginType.NOMAL);
        }
        else{
            member = memberRepository.findByEmailAndLoginType(dto.getEmail(),dto.getLoginType());
        }
        System.out.println();
        Refrigerator refrigerator = refRepository.findByMember_Id(member.getId());

        List<IngreBigDto> inglist =insertService.getAllIng(refrigerator.getId());
        List<BigTags> biList = insertService.getBiList();
        List<RecipeApiDTO3> recipeApiDTO3s= new ArrayList<>();
        List<RecipeApiDTO> recipeLists = recipeApiService.getRecipeData();
        List<RecipeBoard> recipeBoards = recipeBoardRepository.findAllByDelCheckIsN();
        for(int i =0;i<recipeLists.size();i++){
            RecipeApiDTO3 dto3 = new RecipeApiDTO3(recipeLists.get(i));
            String[] count = recipeLists.get(i).getRcp_part().split(",");
            dto3.setCount_str(0+"/"+count.length);
            recipeApiDTO3s.add(dto3);
        }

        for(RecipeBoard recipeBoard : recipeBoards) {
            RecipeApiDTO3 recipeApiDTO3 = new RecipeApiDTO3();
            String content = "";
            String ingredient = "";
            int num = 1;
            List<RecipeContent> recipeContents = recipeContentRepository.findByRecipeContent(recipeBoard);
            List<RecipeIngredient> recipeIngredients = recipeIngedientRepository.findByrecipeBoard(recipeBoard);
            for(RecipeContent recipeContent : recipeContents) {
                content += num+". "+recipeContent.getContent()+"+";
                num++;
            }
            for(RecipeIngredient recipeIngredient : recipeIngredients) {
                ingredient += recipeIngredient.getIngrediant()+"("+recipeIngredient.getIngrediantVol()+"),";
            }
            recipeApiDTO3.setId(recipeBoard.getWritingid());
            recipeApiDTO3.setRep_nm(recipeBoard.getTitle());
            recipeApiDTO3.setInfo_eng(Integer.toString(recipeBoard.getKcal()));
            recipeApiDTO3.setManual(content);
            recipeApiDTO3.setRcp_part(ingredient);
            String[] count = ingredient.split(",");
            recipeApiDTO3.setCount_str(0+"/"+count.length);
            recipeApiDTO3s.add(recipeApiDTO3);
        }

        return  new ResponseEntity<List<RecipeApiDTO3>>( recipeApiDTO3s,HttpStatus.OK);
    }

    @PostMapping(value = "/finish")
    public @ResponseBody ResponseEntity finish(@RequestBody TwoDto twoDto, Model model,HttpServletRequest request,Principal principal){


        MemberDto dto = (MemberDto) request.getSession().getAttribute("user");
        Member member = new Member();
        if(dto == null){
            member = memberRepository.findByEmailAndLoginType(principal.getName(),LoginType.NOMAL);
        }
        else{
            member = memberRepository.findByEmailAndLoginType(dto.getEmail(),dto.getLoginType());
        }
        Refrigerator refrigerator = refRepository.findByMember_Id(member.getId());

        System.out.println(twoDto.toString());
        List<IngreBigDto> inglist = new ArrayList<>();

        for(String s: twoDto.getInglist()) {
            IngreBigDto ingreBigDto =  insertService.getIngStr3(s);
            if(twoDto.getIngsmall().contains(ingreBigDto.getSmallTags())){
                inglist.add(ingreBigDto);
            }
        }
        return  new ResponseEntity<List<IngreBigDto>>(inglist, HttpStatus.OK);
    }

    @PostMapping(value = "/delete")
    public @ResponseBody ResponseEntity deleteIng( @RequestBody String ids,Model model){

        insertService.DeleteIngs(ids);



        return  new ResponseEntity( HttpStatus.OK);
    }

    @GetMapping("/blog")
    @ResponseBody
    public List<BlogDTO> blogRecipe(@RequestParam("recipeName") String recipeName){

        List<BlogDTO> blogList =recipeApiService.searchBlogRecipe(recipeName);
        return blogList;

    }

    @GetMapping("/video")
    @ResponseBody
    public List<VideoDTO> videoRecipe(String recipeName){

        List<VideoDTO> videoList =recipeApiService.searchvideoRecipe(recipeName);
        return videoList;
    }
    @GetMapping("/choice")
    @ResponseBody
    public RecipeApiDTO RecipeDetail(Long id){

        RecipeApiDTO recipeDetails =recipeApiService.recipeDetails(id);
        return recipeDetails;
    }

    @GetMapping("/api/recipe/set")
    @ResponseBody
    public String recipeSet(){
        recipeApiService.recipeApiSave();
        return "sucess";
    }

    public static String getOnlyDigit(String str){

        StringBuffer sb=new StringBuffer();

        if(str!=null && str.length()!=0){

            Pattern p =  Pattern.compile("[가-힣]");

            Matcher m = p.matcher(str);

            while(m.find()){

                sb.append(m.group());

            }

        }

        return sb.toString();

    }
}

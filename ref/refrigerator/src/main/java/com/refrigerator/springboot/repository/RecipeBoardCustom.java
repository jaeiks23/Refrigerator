package com.refrigerator.springboot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.refrigerator.springboot.dto.MypageCommentDTO;
import com.refrigerator.springboot.dto.RecipeApiDTO3;
import com.refrigerator.springboot.dto.RecipeSearchDTO;
import com.refrigerator.springboot.dto.ShowBoardDTO;
import com.refrigerator.springboot.entity.Member;
import com.refrigerator.springboot.entity.RecipeBoard;

public interface RecipeBoardCustom {

	Page<ShowBoardDTO> findByDelCheckIsNAndSearch(RecipeSearchDTO recipeSearchDTO, Pageable pageable);

	Page<ShowBoardDTO> myPageDelCheckIsNAndSearch(RecipeSearchDTO recipeSearchDTO, Pageable pageable, Member member);

	Page<ShowBoardDTO> myPageRecipeBook(Pageable pageable, Member member);

	Page<MypageCommentDTO> getMyRecipeComment(Member member, Pageable pageable);

	List<ShowBoardDTO> bestRecipe();

}

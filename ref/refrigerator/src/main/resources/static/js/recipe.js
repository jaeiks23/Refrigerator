$(function () {
    detailRecipeclick();
    startClick();
});
let intid;
let sname  ="";
let lists = new Array();
let ingcounts = document.querySelectorAll('.ingcount');
for(let l = 0;l<ingcounts.length;l++){
    let stlist = ingcounts[l].previousElementSibling.firstChild.textContent.split(",");
    let scount = 0;
    for(let i=0;i<stlist.length;i++){
        for(let z = 0;z<myIngList.length;z++){
            if(stlist[i].includes(myIngList[z])){
                scount++;
            }
        }

    }
    let counts  = scount+"/"+stlist.length;
    ingcounts[l].textContent = counts;
}
function blogclick() {
    let blog_btns = document.querySelectorAll('.blog_btn');
    for(let i =0;i<blog_btns.length;i++){
        blog_btns[i].addEventListener('click',function(){
            let token = $("meta[name='_csrf']").attr("content");
            let header = $("meta[name='_csrf_header']").attr("content");
            const name = $(this).val();
            let valeus = $(this).parent().prev().prev().children('span').html();
            $.ajax({
                type:'GET',
                data:{"recipeName":name},
                url:'/refrigeratorRecipe/blog',
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(header, token);
                },
                success: function(data){
                    $('.recipeBList').html("");
                    for(let i=0;i<data.length;i++){
                        let html = '';
                        html +='<li>';
                        html +='<a href="'+data[i].link+'" target="_blank">';
                        html +='<p>'+data[i].title+'</p>';
                        html +='<p>'+data[i].snippet+'</p>';
                        html +='<img src="'+data[i].cse_img+'" style="width:200px"></img>';
                        html +='</a>';
                        html +='</li>';
                        $('.recipeBList').append(html);
                    };
                    $('#BlogCook').html("블로그 조회");
                    $('.finishCook').val(valeus);
                    $('.recipePage1').css('display','none');
                    $('.checkBlog').css('display','block');
                    $('.recipeTables').css('display','block');
                    $('.finishVlog').css('display','none');
                    $('.finishCook').css('display','block');
                    $('.backbtn').css('display','none');
                    $('.backbtns').css('display','none');
                    $('.recipeBList').css('display','block');

                },
                error: function(){
                    console.error();
                }
            })
        });

    }

};

function videoclick() {
    let video_btn = document.querySelectorAll('.video_btn');
    for(let i =0;i<video_btn.length;i++){
        video_btn[i].addEventListener('click',function(){
            const name = $(this).val();
            let token = $("meta[name='_csrf']").attr("content");
            let header = $("meta[name='_csrf_header']").attr("content");
            let valeus = $(this).parent().prev().prev().children('span').html();
            $.ajax({
                type:'GET',
                data:{"recipeName":name},
                url:'/refrigeratorRecipe/video',
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(header, token);
                },
                success: function(data){
                    $('.recipeVList').html("");
                    for(let i=0;i<data.length;i++){
                        console.log(data[i].title);
                        let html = '';
                        html +='<div class="recipeTables2">';
                        html +='<button class="showTube" type="button" value="'+data[i].videoId+'">';
                        html +='<img src="'+data[i].high_url+'" class="videoImg" style="width:300px;"></img>';
                        html +='<p>'+data[i].title+'</p>';
                        html +='</button>';
                        html +='</div>';
                        $('.recipeVList').append(html);
                    };
                    $('#VideoCook').html("동영상 조회");
                    $('.finishCook').val(valeus);
                    $('.recipePage1').css('display','none');
                    $('.checkVideo').css('display','block');
                    $('.finishCook').css('display','block');
                    $('.backbtn').css('display','none');
                    $('.backbtns').css('display','none');
                    $('.recipeVList').css('display','block');
                    $('.recipeBList').css('display','none');
                    $('.recipeDetails').css('display','none');

                },
                error: function(){
                    console.error();
                }
            })
        });

    }

};

function detailRecipeclick() {
    let detailRecipe = document.querySelectorAll('.detailRecipe');
    for(let i =0;i<detailRecipe.length;i++){
        detailRecipe[i].addEventListener('click',function(){
            const id = $(this).val();
            console.log(name);
            intid = id;
            if($(this).parent().parent().prev().hasClass("showList")){
                console.log($(this).parent().parent().prev().children().eq(0).children().eq(0).val());
                $('.backbtn').val($(this).parent().parent().prev().children().eq(0).children().eq(0).val());

                $('.backbtn').css("display","block");
            }
            else{
                $('.backbtn').css("display","none");
            }
            if($(this).parent().parent().next().hasClass("showList")){
                $('.backbtns').val($(this).parent().parent().next().children().eq(0).children().eq(0).val());

                $('.backbtns').css("display","block");
            }
            else{
                $('.backbtns').css("display","none");
            }
            let token = $("meta[name='_csrf']").attr("content");
            let header = $("meta[name='_csrf_header']").attr("content");
            $.ajax({
                type:'GET',
                data:{id:id},
                url:'/refrigeratorRecipe/choice',
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(header, token);
                },
                success: function(data){
                    console.log(data);


                    $('#choiceCook').html(data.rep_nm +" (칼로리 "+ data.info_eng+")");

                    let datarcp= data.rcp_part.replaceAll(",",", ");

                    let html = "<td>재료</td>"
                    let html3 = "<td class = 'ingSmall' style='text-align: left;font-size: 19px;'> ➤ "+"ㅤ"+datarcp+"</td>";

                    let cook = "";
                    cook += "<li>";
                    cook += "<pre class = 'pre'>";
                    cook += "<div>"
                    cook += "<span class = 'recspan' style='display: block;width: 100%;text-wrap: wrap;'>"

                    cook += "</span>"
                    cook += "</div>"
                    cook += "</pre>";
                    cook += "</li>";
                    $('#rcp_part').html("");
                    $('#rcp_part2').html("");
                    $('.recipeDetails').html("");
                    $('#rcp_part').html(html);
                    $('#rcp_part2').html(html3);
                    $('.recipeDetails').append(cook);
                    $('.recspan').html(createhtml6(data.manual));

                    $('.recipeDetails').css('display','block');
                    $('.recipePage1').css('display','none');
                    $('.recipeDetail').css('display','block');
                    $('.recipeTables').css('display','block');
                    $('.finishDetail').css('display','none');
                    $('.finishCook').css('display','block');
                    $('.recipeBList').css('display','none');
                    $('.recipeVList').css('display','none');

                },
                error: function(){
                    console.error();
                }
            })
        });

    }

};
function createhtml6(data){
    console.log(data);
    let str;
    let strs =data;
    if(data.indexOf("\n")!= -1){
        strs = data.replaceAll("\n","");
    }

    strs = strs.split("+");
    for(let i =0;i<strs.length;i++){
        str += strs[i]+"\n";
    }
    str =str.replace("undefined","");

    return str;

}


$('.backbtn').click(function(){
    let id  = $(this).val();
    intid = id;
    nextside(id);
    checkNext(id);

});
$('.backbtns').click(function(){
    let id  = $(this).val();
    intid = id;
    nextside(id);
    checkNext(id);

});
function checkNext(id){
    let detailRecipe = document.querySelectorAll('.detailRecipe');
    for(let i =0;i<detailRecipe.length;i++){
        if(detailRecipe[i].value==id){
            console.log($(this));
            if($(detailRecipe[i]).parent().parent().prev().hasClass("showList")){
                console.log($(detailRecipe[i]).parent().parent().prev().children().eq(0).children().eq(0).val());
                $('.backbtn').val($(detailRecipe[i]).parent().parent().prev().children().eq(0).children().eq(0).val());

                $('.backbtn').css("display","block");
            }
            else{
                $('.backbtn').css("display","none");
            }
            if($(detailRecipe[i]).parent().parent().next().hasClass("showList")){
                $('.backbtns').val($(detailRecipe[i]).parent().parent().next().children().eq(0).children().eq(0).val());

                $('.backbtns').css("display","block");
            }
            else{
                $('.backbtns').css("display","none");
            }
        }
    }
}
$('.backs').click(function(){
    if( $('.finishDetail').css("display")=="block"){
        $('.recipeTables').css("display","block");
        $('.finishDetail').css("display","none");
        $('.finishCook').css("display","block");
        $('#choiceCook').html(sname);
        checkNext(intid);
    }else if($('.finishVlog').css("display")=="block"){
        $('.finishVlog').css("display", "none");
        $('.recipeTables').css("display", "block");
        $('.finishCook').css("display","block");
        $('#BlogCook').html("블로그 조회");
    }else if($('.finishVideo').css("display")=="block"){
        $('.finishVideo').css("display", "none");
        $('.recipeTables').css("display", "block");
        $('.finishCook').css("display","block");
        $('#VideoCook').html("동영상 조회");

    }

    else if($('.checkBlog').css("display")=="block"){
        $('.checkBlog').css("display", "none");
        $('.recipePage1').css("display", "block");

    }else if($('.checkVideo').css("display")=="block"){
        $('.checkVideo').css("display", "none");
        $('.recipePage1').css("display", "block");
    }
    else {
        $('.recipeDetail').css("display", "none");
        $('.recipePage1').css("display", "block");
    }
});
function nextside(id){
    let token = $("meta[name='_csrf']").attr("content");
    let header = $("meta[name='_csrf_header']").attr("content");
    $.ajax({
        type:'GET',
        data:{id:id},
        url:'/refrigeratorRecipe/choice',
        beforeSend: function (xhr) {
            xhr.setRequestHeader(header, token);
        },
        success: function(data){
            console.log(data);


            $('#choiceCook').html(data.rep_nm +" (칼로리 "+ data.info_eng+")");

            let datarcp= data.rcp_part.replaceAll(",",", ");

            let html = "<td>재료</td>"
            let html3 = "<td class = 'ingSmall' style='text-align: left;font-size: 19px;'> ➤ "+"ㅤ"+datarcp+"</td>";

            let cook = "";
            cook += "<li>";
            cook += "<pre class = 'pre'>";
            cook += "<div>"
            cook += "<span class = 'recspan' style='display: block;width: 100%;text-wrap: wrap;'>"

            cook += "</span>"
            cook += "</div>"
            cook += "</pre>";
            cook += "</li>";
            $('#rcp_part').html("");
            $('#rcp_part2').html("");
            $('.recipeDetails').html("");
            $('#rcp_part').html(html);
            $('#rcp_part2').html(html3);
            $('.recipeDetails').append(cook);
            $('.recspan').html(createhtml6(data.manual));

            $('.recipeDetails').css('display','block');
            $('.recipePage1').css('display','none');
            $('.recipeDetail').css('display','block');
            $('.recipeTables').css('display','block');
            $('.finishDetail').css('display','none');
            $('.finishCook').css('display','block');
            $('.recipeBList').css('display','none');
            $('.recipeVList').css('display','none');

        },
        error: function(){
            console.error();
        }
    })
}
$(document).on("click",".showTube",function(){
    const videoId = $(this).val();
    const url = 'https://www.youtube.com/embed/'+videoId;
    $('#Yplayer').attr('src',url);
    $('#mask').css('display','flex');
});
$('#closeVideo').click(function(){
    $('#mask').css('display','none');
    $('#Yplayer').attr('src',"");
})
let myIngList = new Array();
function startClick() {
    let rec_ing = document.querySelectorAll('.rec_ing');
    for (let i = 0; i < rec_ing.length; i++) {
        rec_ing[i].addEventListener('click', function () {

            ing_id = this.value;
            var token = $("meta[name='_csrf']").attr("content");
            var header = $("meta[name='_csrf_header']").attr("content");
            if (myIngList.indexOf(ing_id) != -1) {
                myIngList = myIngList.filter((ele) => ele != ing_id);
                $(this).css('border', 'solid 1px black');
            } else {
                myIngList.push(ing_id);
                $(this).css('border', 'solid 2px red');
            }
            console.log(myIngList);
            if (myIngList.length == 0) {
                $.ajax({
                    url: "/refrigeratorRecipe/ing/selects",
                    type: "POST",
                    contentType: "application/json; charset=UTF-8",
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader(header, token);
                    },
                    success: function (data) {
                        showRecipeList2(data);
                        detailRecipeclick();
                    }
                    , error: function (request, status, error) {
                        console.log(error);
                    }
                });
            } else {

                $.ajax({
                    url: "/refrigeratorRecipe/ing",
                    type: "POST",
                    contentType: "application/json; charset=UTF-8",

                    data: JSON.stringify(myIngList),
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader(header, token);
                    },
                    success: function (data) {
                        showRecipeList(data);
                        detailRecipeclick();
                    }
                    , error: function (request, status, error) {
                        console.log(error);
                    }
                });
            }
        });
    }
}
function finsishCook(){
    if(myIngList.length ==0){
        location.href="/refrigeratorRecipe/"
    }
    else{
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");

        let iss =  $('.ingSmall').html();

        let param = {
            inglist : myIngList,
            ingsmall : iss
        }

        $.ajax({
            url : "/refrigeratorRecipe/finish",
            type : "POST",
            contentType : "application/json; charset=UTF-8",

            data :JSON.stringify(param),
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success  : function(data){
                console.log(data);
                sname = $('#choiceCook').text();
                $('#choiceCook').html("재료 리스트");
                $('.finishDetail').html(createhtml5(data));
                let str = "<button class = 'finish' onclick='finish()'>완료</button>";
                $('.finishDetail').append(str);

                $('.recipeTables').css('display','none');
                $('.finishDetail').css('display','block');
                $('.finishCook').css('display','none');
                deleteIng();
                $('.backbtns').css("display","none");
                $('.backbtn').css("display","none");

            }
            ,error : function(request, status, error) {
                console.log(error);
            }
        });

    }
}
function finish(){
    location.href="/refrigeratorRecipe/"
}
function finsishCook3(){
    if(myIngList.length ==0){
        finish();
    }
    else{
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");
        let iss =  $('.finishCook').val();

        let param = {
            inglist : myIngList,
            ingsmall : iss
        }
        $.ajax({
            url : "/refrigeratorRecipe/finish",
            type : "POST",
            contentType : "application/json; charset=UTF-8",

            data :JSON.stringify(param),
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success  : function(data){
                console.log(data);
                $('#BlogCook').html("재료 리스트");
                $('.finishVlog').html(createhtml5(data));
                let str = "<button class = 'finish' onclick='finish()'>완료</button>";
                $('.finishVlog').append(str);
                $('.recipeTables').css('display','none');
                $('.finishVlog').css('display','block');
                $('.finishCook').css('display','none');
                deleteIng();
            }
            ,error : function(request, status, error) {
                console.log(error);
            }
        });





    }


}
function finsishCook2(){
    if(myIngList.length ==0){
        finish();
    }
    else{
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");
        let iss =  $('.finishCook').val();
        let param = {
            inglist : myIngList,
            ingsmall : iss
        }
        $.ajax({
            url : "/refrigeratorRecipe/finish",
            type : "POST",
            contentType : "application/json; charset=UTF-8",

            data :JSON.stringify(param),
            beforeSend: function (xhr) {
                xhr.setRequestHeader(header, token);
            },
            success  : function(data){
                console.log(data);
                $('#VideoCook').html("재료 리스트");
                $('.finishVideo').html(createhtml5(data));
                let str = "<button class = 'finish' onclick='finish()'>완료</button>";
                $('.finishVideo').append(str);
                $('.recipeTables').css('display','none');
                $('.finishVideo').css('display','block');
                $('.finishCook').css('display','none');
                deleteIng();

            }
            ,error : function(request, status, error) {
                console.log(error);
            }
        });
    }
}
function showRecipeList(data){
    console.log(data);
    data.sort(function(a, b) {
        return b.count -a.count;
    });

    $('.showList').remove();
    $('.listTable').append(createhtml4(data));

    let ingcounts = document.querySelectorAll('.ingcount');

}
function showRecipeList2(data){
    console.log(data);
    data.sort(function(a, b) {
        return b.count -a.count;
    });

    $('.showList').remove();
    $('.listTable').append(createhtml4(data));



}
function createhtml4(data){
    let datalist = [];



    data.forEach((fruit) => {
        datalist.push(`

                    <tr class = "showList">
                    <td class="tdcss2">
                    <button id="detailRecipe" class="detailRecipe Sfont  " value='${fruit.id}'><span>${fruit.rep_nm}</span></button>
                    </td>
                    <td class="Sfont tdcss"><span>${fruit.rcp_part}</span></td>
                    <td class="Sfont ingcount tdcss" style="text-align:center;"><span>${fruit.count_str}</span></td>
                    <td class="Sfont" style="text-align:center;">
                       <button class="blog_btn" value = '${fruit.rep_nm}' onclick="blogclick()">Blog</button>
                       <button class="video_btn" value='${fruit.rep_nm}' onclick="videoclick()">Video</button>
                    </td>
                    </tr>
                `);
    });



    let str = "";

    datalist.forEach((element) => {
        const separator = " ";
        if (str.length == 0) {
            str = str + element;
        } else {
            str = str + separator + element;
        }
    })

    return str;


}
function deleteIng(){
    let dele = document.querySelectorAll('.deleteIng');
    for(let i=0;i<dele.length;i++){
        dele[i].addEventListener('click',function(){
            let ids = this.value;
            var token = $("meta[name='_csrf']").attr("content");
            var header = $("meta[name='_csrf_header']").attr("content");
            $(this).parent().parent().remove();
            $.ajax({
                url : "/refrigeratorRecipe/delete",
                type : "POST",
                contentType : "application/json; charset=UTF-8",

                data :ids,
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(header, token);
                },
                success  : function(data){

                }
                ,error : function(request, status, error) {
                    console.log(error);
                }
            });

        })
    }
}
function createhtml5(data){
    let datalist = [];
    data.forEach((fruit) => {
        datalist.push(`

                    <tr class>
                    <td>
                    <img class= "img"src="${fruit.srcs}">
                    </td>
                    <td ><span class="spansmall">${fruit.smallTags}</span></td>
                    <td>
                       <button class = "deleteIng" value='${fruit.id}' >삭제</button>
                    </td>
                    </tr>
                `);
    });
    let str = "";

    datalist.forEach((element) => {
        const separator = " ";
        if (str.length == 0) {
            str = str + element;
        } else {
            str = str + separator + element;
        }
    })
    return str;
}
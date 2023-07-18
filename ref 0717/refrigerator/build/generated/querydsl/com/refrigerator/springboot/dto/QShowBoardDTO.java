package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QShowBoardDTO is a Querydsl Projection type for ShowBoardDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QShowBoardDTO extends ConstructorExpression<ShowBoardDTO> {

    private static final long serialVersionUID = -1280750381L;

    public QShowBoardDTO(com.querydsl.core.types.Expression<Long> writingId, com.querydsl.core.types.Expression<Integer> writingCount, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.RecipeImage> recipeImage, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> difficulty, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.Member> member, com.querydsl.core.types.Expression<java.time.LocalDateTime> regDate, com.querydsl.core.types.Expression<Integer> seenCount, com.querydsl.core.types.Expression<Integer> recomCount) {
        super(ShowBoardDTO.class, new Class<?>[]{long.class, int.class, com.refrigerator.springboot.entity.RecipeImage.class, String.class, String.class, com.refrigerator.springboot.entity.Member.class, java.time.LocalDateTime.class, int.class, int.class}, writingId, writingCount, recipeImage, title, difficulty, member, regDate, seenCount, recomCount);
    }

}


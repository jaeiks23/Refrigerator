package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QRecipeCommentDTO is a Querydsl Projection type for RecipeCommentDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRecipeCommentDTO extends ConstructorExpression<RecipeCommentDTO> {

    private static final long serialVersionUID = -749207989L;

    public QRecipeCommentDTO(com.querydsl.core.types.Expression<Long> commentid, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.Member> member, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.RecipeBoard> recipeBoard, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<java.time.LocalDateTime> regdate, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.Board> board) {
        super(RecipeCommentDTO.class, new Class<?>[]{long.class, com.refrigerator.springboot.entity.Member.class, com.refrigerator.springboot.entity.RecipeBoard.class, String.class, java.time.LocalDateTime.class, com.refrigerator.springboot.entity.Board.class}, commentid, member, recipeBoard, content, regdate, board);
    }

}


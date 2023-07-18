package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QIngredientDto is a Querydsl Projection type for IngredientDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QIngredientDto extends ConstructorExpression<IngredientDto> {

    private static final long serialVersionUID = -1840594863L;

    public QIngredientDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<java.time.LocalDateTime> ing_deadline, com.querydsl.core.types.Expression<String> smalltags, com.querydsl.core.types.Expression<java.time.LocalDateTime> regTime, com.querydsl.core.types.Expression<String> texts) {
        super(IngredientDto.class, new Class<?>[]{long.class, java.time.LocalDateTime.class, String.class, java.time.LocalDateTime.class, String.class}, id, ing_deadline, smalltags, regTime, texts);
    }

}


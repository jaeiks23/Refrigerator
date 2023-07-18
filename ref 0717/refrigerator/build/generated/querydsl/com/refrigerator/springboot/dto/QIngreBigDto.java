package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QIngreBigDto is a Querydsl Projection type for IngreBigDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QIngreBigDto extends ConstructorExpression<IngreBigDto> {

    private static final long serialVersionUID = -371935881L;

    public QIngreBigDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<java.time.LocalDateTime> ing_deadline, com.querydsl.core.types.Expression<String> smalltags, com.querydsl.core.types.Expression<Long> big, com.querydsl.core.types.Expression<String> src, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.BigTags> bigtags, com.querydsl.core.types.Expression<String> memo) {
        super(IngreBigDto.class, new Class<?>[]{long.class, java.time.LocalDateTime.class, String.class, long.class, String.class, com.refrigerator.springboot.entity.BigTags.class, String.class}, id, ing_deadline, smalltags, big, src, bigtags, memo);
    }

}


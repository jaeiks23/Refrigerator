package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QSmallDto is a Querydsl Projection type for SmallDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QSmallDto extends ConstructorExpression<SmallDto> {

    private static final long serialVersionUID = -1420603531L;

    public QSmallDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> tag_small_name, com.querydsl.core.types.Expression<Long> bigTagID) {
        super(SmallDto.class, new Class<?>[]{long.class, String.class, long.class}, id, tag_small_name, bigTagID);
    }

}


package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QCookBoardDTO is a Querydsl Projection type for CookBoardDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCookBoardDTO extends ConstructorExpression<CookBoardDTO> {

    private static final long serialVersionUID = 1469752862L;

    public QCookBoardDTO(com.querydsl.core.types.Expression<Long> writingId, com.querydsl.core.types.Expression<Integer> writingCount, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.CookImage> cookImage, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.Member> member, com.querydsl.core.types.Expression<java.time.LocalDateTime> regDate, com.querydsl.core.types.Expression<Integer> seenCount, com.querydsl.core.types.Expression<Integer> recomCount) {
        super(CookBoardDTO.class, new Class<?>[]{long.class, int.class, com.refrigerator.springboot.entity.CookImage.class, String.class, com.refrigerator.springboot.entity.Member.class, java.time.LocalDateTime.class, int.class, int.class}, writingId, writingCount, cookImage, title, member, regDate, seenCount, recomCount);
    }

}


package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QMypageCommentDTO is a Querydsl Projection type for MypageCommentDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMypageCommentDTO extends ConstructorExpression<MypageCommentDTO> {

    private static final long serialVersionUID = 797912760L;

    public QMypageCommentDTO(com.querydsl.core.types.Expression<java.time.LocalDateTime> regDate, com.querydsl.core.types.Expression<Long> commnetid, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.Board> board, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> url) {
        super(MypageCommentDTO.class, new Class<?>[]{java.time.LocalDateTime.class, long.class, String.class, com.refrigerator.springboot.entity.Board.class, String.class, String.class}, regDate, commnetid, content, board, title, url);
    }

}


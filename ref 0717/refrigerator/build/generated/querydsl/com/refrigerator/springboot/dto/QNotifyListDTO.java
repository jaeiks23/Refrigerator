package com.refrigerator.springboot.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.refrigerator.springboot.dto.QNotifyListDTO is a Querydsl Projection type for NotifyListDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QNotifyListDTO extends ConstructorExpression<NotifyListDTO> {

    private static final long serialVersionUID = 1582684891L;

    public QNotifyListDTO(com.querydsl.core.types.Expression<Long> notifingId, com.querydsl.core.types.Expression<Integer> notifiedNum, com.querydsl.core.types.Expression<? extends com.refrigerator.springboot.entity.Member> member, com.querydsl.core.types.Expression<String> notifiedMember, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> notifiedContent, com.querydsl.core.types.Expression<String> notifiedCase, com.querydsl.core.types.Expression<String> notifiedReason, com.querydsl.core.types.Expression<java.time.LocalDateTime> regDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> didDate, com.querydsl.core.types.Expression<String> did, com.querydsl.core.types.Expression<Long> writingId, com.querydsl.core.types.Expression<Long> commentId, com.querydsl.core.types.Expression<Long> boardId) {
        super(NotifyListDTO.class, new Class<?>[]{long.class, int.class, com.refrigerator.springboot.entity.Member.class, String.class, String.class, String.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, String.class, long.class, long.class, long.class}, notifingId, notifiedNum, member, notifiedMember, title, notifiedContent, notifiedCase, notifiedReason, regDate, didDate, did, writingId, commentId, boardId);
    }

}


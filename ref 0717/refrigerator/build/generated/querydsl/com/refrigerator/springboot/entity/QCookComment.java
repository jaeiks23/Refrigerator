package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCookComment is a Querydsl query type for CookComment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCookComment extends EntityPathBase<CookComment> {

    private static final long serialVersionUID = -1933011302L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCookComment cookComment = new QCookComment("cookComment");

    public final QBoard board;

    public final NumberPath<Long> commentid = createNumber("commentid", Long.class);

    public final StringPath content = createString("content");

    public final QCookBoard cookboard;

    public final QMember member;

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public QCookComment(String variable) {
        this(CookComment.class, forVariable(variable), INITS);
    }

    public QCookComment(Path<? extends CookComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCookComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCookComment(PathMetadata metadata, PathInits inits) {
        this(CookComment.class, metadata, inits);
    }

    public QCookComment(Class<? extends CookComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
        this.cookboard = inits.isInitialized("cookboard") ? new QCookBoard(forProperty("cookboard"), inits.get("cookboard")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}


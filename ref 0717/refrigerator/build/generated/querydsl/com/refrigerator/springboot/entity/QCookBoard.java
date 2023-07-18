package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCookBoard is a Querydsl query type for CookBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCookBoard extends EntityPathBase<CookBoard> {

    private static final long serialVersionUID = -382834207L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCookBoard cookBoard = new QCookBoard("cookBoard");

    public final QBoard board;

    public final StringPath content = createString("content");

    public final ListPath<CookImage, QCookImage> cookImages = this.<CookImage, QCookImage>createList("cookImages", CookImage.class, QCookImage.class, PathInits.DIRECT2);

    public final NumberPath<Integer> dailycount = createNumber("dailycount", Integer.class);

    public final EnumPath<com.refrigerator.springboot.constant.Delcheck> delcheck = createEnum("delcheck", com.refrigerator.springboot.constant.Delcheck.class);

    public final NumberPath<Integer> exceptdaily = createNumber("exceptdaily", Integer.class);

    public final QMember member;

    public final EnumPath<com.refrigerator.springboot.constant.NoticeCheck> noticecheck = createEnum("noticecheck", com.refrigerator.springboot.constant.NoticeCheck.class);

    public final NumberPath<Integer> recomcount = createNumber("recomcount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> seencount = createNumber("seencount", Integer.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> writingcount = createNumber("writingcount", Integer.class);

    public final NumberPath<Long> writingid = createNumber("writingid", Long.class);

    public QCookBoard(String variable) {
        this(CookBoard.class, forVariable(variable), INITS);
    }

    public QCookBoard(Path<? extends CookBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCookBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCookBoard(PathMetadata metadata, PathInits inits) {
        this(CookBoard.class, metadata, inits);
    }

    public QCookBoard(Class<? extends CookBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}


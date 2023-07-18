package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCookRecommend is a Querydsl query type for CookRecommend
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCookRecommend extends EntityPathBase<CookRecommend> {

    private static final long serialVersionUID = 286234167L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCookRecommend cookRecommend = new QCookRecommend("cookRecommend");

    public final QCookBoard cookboard;

    public final QMember member;

    public final NumberPath<Long> recomid = createNumber("recomid", Long.class);

    public QCookRecommend(String variable) {
        this(CookRecommend.class, forVariable(variable), INITS);
    }

    public QCookRecommend(Path<? extends CookRecommend> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCookRecommend(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCookRecommend(PathMetadata metadata, PathInits inits) {
        this(CookRecommend.class, metadata, inits);
    }

    public QCookRecommend(Class<? extends CookRecommend> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cookboard = inits.isInitialized("cookboard") ? new QCookBoard(forProperty("cookboard"), inits.get("cookboard")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}


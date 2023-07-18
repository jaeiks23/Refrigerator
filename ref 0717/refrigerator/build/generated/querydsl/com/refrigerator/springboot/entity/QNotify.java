package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotify is a Querydsl query type for Notify
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotify extends EntityPathBase<Notify> {

    private static final long serialVersionUID = -211452730L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotify notify = new QNotify("notify");

    public final NumberPath<Long> boardid = createNumber("boardid", Long.class);

    public final NumberPath<Long> commentid = createNumber("commentid", Long.class);

    public final StringPath did = createString("did");

    public final DateTimePath<java.time.LocalDateTime> diddate = createDateTime("diddate", java.time.LocalDateTime.class);

    public final QMember member;

    public final StringPath notifiedcase = createString("notifiedcase");

    public final StringPath notifiedcontent = createString("notifiedcontent");

    public final StringPath notifiedmember = createString("notifiedmember");

    public final NumberPath<Integer> notifiednum = createNumber("notifiednum", Integer.class);

    public final StringPath notifiedreason = createString("notifiedreason");

    public final NumberPath<Long> notifingid = createNumber("notifingid", Long.class);

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public final NumberPath<Long> writingid = createNumber("writingid", Long.class);

    public QNotify(String variable) {
        this(Notify.class, forVariable(variable), INITS);
    }

    public QNotify(Path<? extends Notify> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotify(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotify(PathMetadata metadata, PathInits inits) {
        this(Notify.class, metadata, inits);
    }

    public QNotify(Class<? extends Notify> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}


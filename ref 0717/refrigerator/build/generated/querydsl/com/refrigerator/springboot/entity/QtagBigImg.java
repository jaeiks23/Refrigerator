package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QtagBigImg is a Querydsl query type for tagBigImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QtagBigImg extends EntityPathBase<tagBigImg> {

    private static final long serialVersionUID = -1326432160L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QtagBigImg tagBigImg = new QtagBigImg("tagBigImg");

    public final QBigTags bigTags;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath srcs = createString("srcs");

    public QtagBigImg(String variable) {
        this(tagBigImg.class, forVariable(variable), INITS);
    }

    public QtagBigImg(Path<? extends tagBigImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QtagBigImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QtagBigImg(PathMetadata metadata, PathInits inits) {
        this(tagBigImg.class, metadata, inits);
    }

    public QtagBigImg(Class<? extends tagBigImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bigTags = inits.isInitialized("bigTags") ? new QBigTags(forProperty("bigTags")) : null;
    }

}


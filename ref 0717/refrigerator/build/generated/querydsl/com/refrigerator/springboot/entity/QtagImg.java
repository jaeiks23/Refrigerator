package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QtagImg is a Querydsl query type for tagImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QtagImg extends EntityPathBase<tagImg> {

    private static final long serialVersionUID = 863107878L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QtagImg tagImg = new QtagImg("tagImg");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QSmallTags smallTags;

    public final StringPath srcs = createString("srcs");

    public QtagImg(String variable) {
        this(tagImg.class, forVariable(variable), INITS);
    }

    public QtagImg(Path<? extends tagImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QtagImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QtagImg(PathMetadata metadata, PathInits inits) {
        this(tagImg.class, metadata, inits);
    }

    public QtagImg(Class<? extends tagImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.smallTags = inits.isInitialized("smallTags") ? new QSmallTags(forProperty("smallTags"), inits.get("smallTags")) : null;
    }

}


package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSmallTags is a Querydsl query type for SmallTags
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSmallTags extends EntityPathBase<SmallTags> {

    private static final long serialVersionUID = 2098474787L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSmallTags smallTags = new QSmallTags("smallTags");

    public final QBigTags bigTags;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath tag_small_name = createString("tag_small_name");

    public QSmallTags(String variable) {
        this(SmallTags.class, forVariable(variable), INITS);
    }

    public QSmallTags(Path<? extends SmallTags> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSmallTags(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSmallTags(PathMetadata metadata, PathInits inits) {
        this(SmallTags.class, metadata, inits);
    }

    public QSmallTags(Class<? extends SmallTags> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bigTags = inits.isInitialized("bigTags") ? new QBigTags(forProperty("bigTags")) : null;
    }

}


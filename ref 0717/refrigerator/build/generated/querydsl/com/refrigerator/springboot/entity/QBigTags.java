package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBigTags is a Querydsl query type for BigTags
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBigTags extends EntityPathBase<BigTags> {

    private static final long serialVersionUID = -209621156L;

    public static final QBigTags bigTags = new QBigTags("bigTags");

    public final StringPath big_name = createString("big_name");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QBigTags(String variable) {
        super(BigTags.class, forVariable(variable));
    }

    public QBigTags(Path<? extends BigTags> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBigTags(PathMetadata metadata) {
        super(BigTags.class, metadata);
    }

}


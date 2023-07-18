package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTemporaryImage is a Querydsl query type for TemporaryImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTemporaryImage extends EntityPathBase<TemporaryImage> {

    private static final long serialVersionUID = -1378771449L;

    public static final QTemporaryImage temporaryImage = new QTemporaryImage("temporaryImage");

    public final NumberPath<Long> imageid = createNumber("imageid", Long.class);

    public final StringPath imgname = createString("imgname");

    public final StringPath oriname = createString("oriname");

    public final StringPath url = createString("url");

    public QTemporaryImage(String variable) {
        super(TemporaryImage.class, forVariable(variable));
    }

    public QTemporaryImage(Path<? extends TemporaryImage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTemporaryImage(PathMetadata metadata) {
        super(TemporaryImage.class, metadata);
    }

}


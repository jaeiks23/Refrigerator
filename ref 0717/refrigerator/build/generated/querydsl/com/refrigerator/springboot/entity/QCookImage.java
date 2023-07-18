package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCookImage is a Querydsl query type for CookImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCookImage extends EntityPathBase<CookImage> {

    private static final long serialVersionUID = -376429482L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCookImage cookImage = new QCookImage("cookImage");

    public final QCookBoard cookboard;

    public final NumberPath<Long> imageid = createNumber("imageid", Long.class);

    public final StringPath imgname = createString("imgname");

    public final StringPath oriname = createString("oriname");

    public final StringPath repimage = createString("repimage");

    public final StringPath url = createString("url");

    public QCookImage(String variable) {
        this(CookImage.class, forVariable(variable), INITS);
    }

    public QCookImage(Path<? extends CookImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCookImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCookImage(PathMetadata metadata, PathInits inits) {
        this(CookImage.class, metadata, inits);
    }

    public QCookImage(Class<? extends CookImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cookboard = inits.isInitialized("cookboard") ? new QCookBoard(forProperty("cookboard"), inits.get("cookboard")) : null;
    }

}


package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeImage is a Querydsl query type for RecipeImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeImage extends EntityPathBase<RecipeImage> {

    private static final long serialVersionUID = 835038480L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeImage recipeImage = new QRecipeImage("recipeImage");

    public final NumberPath<Long> imageid = createNumber("imageid", Long.class);

    public final StringPath imgname = createString("imgname");

    public final StringPath oriname = createString("oriname");

    public final QRecipeBoard recipeboard;

    public final StringPath repimage = createString("repimage");

    public final StringPath url = createString("url");

    public QRecipeImage(String variable) {
        this(RecipeImage.class, forVariable(variable), INITS);
    }

    public QRecipeImage(Path<? extends RecipeImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeImage(PathMetadata metadata, PathInits inits) {
        this(RecipeImage.class, metadata, inits);
    }

    public QRecipeImage(Class<? extends RecipeImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recipeboard = inits.isInitialized("recipeboard") ? new QRecipeBoard(forProperty("recipeboard"), inits.get("recipeboard")) : null;
    }

}


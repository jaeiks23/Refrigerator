package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeContent is a Querydsl query type for RecipeContent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeContent extends EntityPathBase<RecipeContent> {

    private static final long serialVersionUID = -1647304978L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeContent recipeContent = new QRecipeContent("recipeContent");

    public final StringPath content = createString("content");

    public final NumberPath<Long> contentid = createNumber("contentid", Long.class);

    public final QRecipeBoard recipeboard;

    public final StringPath url = createString("url");

    public QRecipeContent(String variable) {
        this(RecipeContent.class, forVariable(variable), INITS);
    }

    public QRecipeContent(Path<? extends RecipeContent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeContent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeContent(PathMetadata metadata, PathInits inits) {
        this(RecipeContent.class, metadata, inits);
    }

    public QRecipeContent(Class<? extends RecipeContent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recipeboard = inits.isInitialized("recipeboard") ? new QRecipeBoard(forProperty("recipeboard"), inits.get("recipeboard")) : null;
    }

}


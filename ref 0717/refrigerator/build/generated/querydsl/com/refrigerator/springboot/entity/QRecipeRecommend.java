package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeRecommend is a Querydsl query type for RecipeRecommend
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeRecommend extends EntityPathBase<RecipeRecommend> {

    private static final long serialVersionUID = -1115803151L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeRecommend recipeRecommend = new QRecipeRecommend("recipeRecommend");

    public final QMember member;

    public final QRecipeBoard recipeboard;

    public final NumberPath<Long> recomid = createNumber("recomid", Long.class);

    public QRecipeRecommend(String variable) {
        this(RecipeRecommend.class, forVariable(variable), INITS);
    }

    public QRecipeRecommend(Path<? extends RecipeRecommend> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeRecommend(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeRecommend(PathMetadata metadata, PathInits inits) {
        this(RecipeRecommend.class, metadata, inits);
    }

    public QRecipeRecommend(Class<? extends RecipeRecommend> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.recipeboard = inits.isInitialized("recipeboard") ? new QRecipeBoard(forProperty("recipeboard"), inits.get("recipeboard")) : null;
    }

}


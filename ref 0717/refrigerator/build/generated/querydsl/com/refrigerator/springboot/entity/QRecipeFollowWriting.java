package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeFollowWriting is a Querydsl query type for RecipeFollowWriting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeFollowWriting extends EntityPathBase<RecipeFollowWriting> {

    private static final long serialVersionUID = 1716091552L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeFollowWriting recipeFollowWriting = new QRecipeFollowWriting("recipeFollowWriting");

    public final NumberPath<Long> followid = createNumber("followid", Long.class);

    public final QMember member;

    public final QRecipeBoard recipeboard;

    public QRecipeFollowWriting(String variable) {
        this(RecipeFollowWriting.class, forVariable(variable), INITS);
    }

    public QRecipeFollowWriting(Path<? extends RecipeFollowWriting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeFollowWriting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeFollowWriting(PathMetadata metadata, PathInits inits) {
        this(RecipeFollowWriting.class, metadata, inits);
    }

    public QRecipeFollowWriting(Class<? extends RecipeFollowWriting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.recipeboard = inits.isInitialized("recipeboard") ? new QRecipeBoard(forProperty("recipeboard"), inits.get("recipeboard")) : null;
    }

}


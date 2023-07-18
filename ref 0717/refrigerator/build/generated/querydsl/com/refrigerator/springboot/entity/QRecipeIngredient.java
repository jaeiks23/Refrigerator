package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeIngredient is a Querydsl query type for RecipeIngredient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeIngredient extends EntityPathBase<RecipeIngredient> {

    private static final long serialVersionUID = -1037142212L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeIngredient recipeIngredient = new QRecipeIngredient("recipeIngredient");

    public final NumberPath<Long> ingId = createNumber("ingId", Long.class);

    public final StringPath ingrediant = createString("ingrediant");

    public final StringPath ingrediantVol = createString("ingrediantVol");

    public final QRecipeBoard recipeBoard;

    public QRecipeIngredient(String variable) {
        this(RecipeIngredient.class, forVariable(variable), INITS);
    }

    public QRecipeIngredient(Path<? extends RecipeIngredient> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeIngredient(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeIngredient(PathMetadata metadata, PathInits inits) {
        this(RecipeIngredient.class, metadata, inits);
    }

    public QRecipeIngredient(Class<? extends RecipeIngredient> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recipeBoard = inits.isInitialized("recipeBoard") ? new QRecipeBoard(forProperty("recipeBoard"), inits.get("recipeBoard")) : null;
    }

}


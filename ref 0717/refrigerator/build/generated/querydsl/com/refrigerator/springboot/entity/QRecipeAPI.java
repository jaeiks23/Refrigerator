package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRecipeAPI is a Querydsl query type for RecipeAPI
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeAPI extends EntityPathBase<RecipeAPI> {

    private static final long serialVersionUID = 246670095L;

    public static final QRecipeAPI recipeAPI = new QRecipeAPI("recipeAPI");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath info_eng = createString("info_eng");

    public final StringPath manual = createString("manual");

    public final StringPath rcp_part = createString("rcp_part");

    public final StringPath rep_nm = createString("rep_nm");

    public QRecipeAPI(String variable) {
        super(RecipeAPI.class, forVariable(variable));
    }

    public QRecipeAPI(Path<? extends RecipeAPI> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecipeAPI(PathMetadata metadata) {
        super(RecipeAPI.class, metadata);
    }

}


package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIngredient is a Querydsl query type for Ingredient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIngredient extends EntityPathBase<Ingredient> {

    private static final long serialVersionUID = -797486898L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIngredient ingredient = new QIngredient("ingredient");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> ing_deadline = createDateTime("ing_deadline", java.time.LocalDateTime.class);

    public final QRefrigerator refrigerator;

    public final DateTimePath<java.time.LocalDateTime> reg_time = createDateTime("reg_time", java.time.LocalDateTime.class);

    public final QSmallTags smallTag;

    public final StringPath textareas = createString("textareas");

    public QIngredient(String variable) {
        this(Ingredient.class, forVariable(variable), INITS);
    }

    public QIngredient(Path<? extends Ingredient> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIngredient(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIngredient(PathMetadata metadata, PathInits inits) {
        this(Ingredient.class, metadata, inits);
    }

    public QIngredient(Class<? extends Ingredient> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refrigerator = inits.isInitialized("refrigerator") ? new QRefrigerator(forProperty("refrigerator"), inits.get("refrigerator")) : null;
        this.smallTag = inits.isInitialized("smallTag") ? new QSmallTags(forProperty("smallTag"), inits.get("smallTag")) : null;
    }

}


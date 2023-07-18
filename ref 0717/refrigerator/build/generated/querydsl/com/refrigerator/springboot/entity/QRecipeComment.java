package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeComment is a Querydsl query type for RecipeComment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeComment extends EntityPathBase<RecipeComment> {

    private static final long serialVersionUID = -1648437036L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeComment recipeComment = new QRecipeComment("recipeComment");

    public final QBoard board;

    public final NumberPath<Long> commentid = createNumber("commentid", Long.class);

    public final StringPath content = createString("content");

    public final QMember member;

    public final QRecipeBoard recipeboard;

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public QRecipeComment(String variable) {
        this(RecipeComment.class, forVariable(variable), INITS);
    }

    public QRecipeComment(Path<? extends RecipeComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeComment(PathMetadata metadata, PathInits inits) {
        this(RecipeComment.class, metadata, inits);
    }

    public QRecipeComment(Class<? extends RecipeComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.recipeboard = inits.isInitialized("recipeboard") ? new QRecipeBoard(forProperty("recipeboard"), inits.get("recipeboard")) : null;
    }

}


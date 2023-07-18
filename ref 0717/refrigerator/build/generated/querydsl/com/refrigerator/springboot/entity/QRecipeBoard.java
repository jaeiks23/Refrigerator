package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecipeBoard is a Querydsl query type for RecipeBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecipeBoard extends EntityPathBase<RecipeBoard> {

    private static final long serialVersionUID = 828633755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecipeBoard recipeBoard = new QRecipeBoard("recipeBoard");

    public final QBoard board;

    public final StringPath cooktip = createString("cooktip");

    public final NumberPath<Integer> dailycount = createNumber("dailycount", Integer.class);

    public final EnumPath<com.refrigerator.springboot.constant.Delcheck> delcheck = createEnum("delcheck", com.refrigerator.springboot.constant.Delcheck.class);

    public final StringPath difficulty = createString("difficulty");

    public final NumberPath<Integer> exceptdaily = createNumber("exceptdaily", Integer.class);

    public final NumberPath<Double> kcal = createNumber("kcal", Double.class);

    public final QMember member;

    public final EnumPath<com.refrigerator.springboot.constant.NoticeCheck> noticecheck = createEnum("noticecheck", com.refrigerator.springboot.constant.NoticeCheck.class);

    public final ListPath<RecipeContent, QRecipeContent> recipecontent = this.<RecipeContent, QRecipeContent>createList("recipecontent", RecipeContent.class, QRecipeContent.class, PathInits.DIRECT2);

    public final ListPath<RecipeImage, QRecipeImage> recipeimage = this.<RecipeImage, QRecipeImage>createList("recipeimage", RecipeImage.class, QRecipeImage.class, PathInits.DIRECT2);

    public final NumberPath<Integer> recomcount = createNumber("recomcount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> seencount = createNumber("seencount", Integer.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> writingcount = createNumber("writingcount", Integer.class);

    public final NumberPath<Long> writingid = createNumber("writingid", Long.class);

    public QRecipeBoard(String variable) {
        this(RecipeBoard.class, forVariable(variable), INITS);
    }

    public QRecipeBoard(Path<? extends RecipeBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecipeBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecipeBoard(PathMetadata metadata, PathInits inits) {
        this(RecipeBoard.class, metadata, inits);
    }

    public QRecipeBoard(Class<? extends RecipeBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}


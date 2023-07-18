package com.refrigerator.springboot.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -249532393L;

    public static final QMember member = new QMember("member1");

    public final DateTimePath<java.time.LocalDateTime> Banndate = createDateTime("Banndate", java.time.LocalDateTime.class);

    public final StringPath banned = createString("banned");

    public final StringPath email = createString("email");

    public final StringPath follow = createString("follow");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.refrigerator.springboot.constant.LoginType> loginType = createEnum("loginType", com.refrigerator.springboot.constant.LoginType.class);

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final StringPath phoneNum = createString("phoneNum");

    public final StringPath profile = createString("profile");

    public final StringPath pw = createString("pw");

    public final EnumPath<com.refrigerator.springboot.constant.Role> role = createEnum("role", com.refrigerator.springboot.constant.Role.class);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}


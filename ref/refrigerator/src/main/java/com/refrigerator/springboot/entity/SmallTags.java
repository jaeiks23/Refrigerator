package com.refrigerator.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "smalltag")
public class SmallTags {
    @Id
    @Column(name = "small_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tag_small_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "big_id")
    private BigTags bigTags;

}
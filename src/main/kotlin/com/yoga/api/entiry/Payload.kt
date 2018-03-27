package com.yoga.api.entiry

import javax.persistence.*
import javax.persistence.JoinColumn
import javax.persistence.MapsId



@Entity
@Table(name = "payload")
class Payload {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: Int = 0

    @Column(name = "comment_count")
    val comments_count: Int? = null

    @Column(name = "content")
    val content: String? = null

    @Column(name = "cover_original")
    val cover_original: String? = null

    @Column(name = "cover_thumbnail")
    val cover_thumbnail: String? = null

    @Column(name = "is_new")
    val isNew: Boolean? = null

    @Column(name = "is_popular")
    val isPopular: Boolean? = null

    @Column(name = "likes_count")
    val likes_count: Int? = null

    @Column(name = "meta_description")
    val meta_description: String? = null

    @Column(name = "meta_title")
    val meta_title: String? = null

    @Column(name = "muscle")
    val muscle: String? = null

    @Column(name = "photo")
    val photo: String? = null

    @Column(name = "position")
    val position: Int? = null

    @Column(name = "sanskrit_name")
    val sanskrit_name: String? = null

    @Column(name = "slug")
    val slug: String? = null

    @Column(name = "title")
    val title: String? = null

    @Column(name = "type")
    val type: String? = null

    @Column(name = "video_web_hq")
    val video_web_hq: String? = null

    //@MapsId("categories_id")
    @ManyToOne
    @JoinColumn(name = "categories_id")
    var categories: Categories? = null
}
package com.yoga.api.entiry

import java.io.Serializable
import javax.persistence.*


@Entity
@Table(name = "levels")
class Level : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "level_id", nullable = false)
    val level_id: Int = 0

    @Column(name = "slug")
    val slug: String? = null

    @Column(name = "title")
    val title: String? = null
}
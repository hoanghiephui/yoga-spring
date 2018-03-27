package com.yoga.api.entiry

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "categories")
class Categories : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categories_id", nullable = false)
    val categories_id: Int = 0

    @Column(name = "slug")
    val slug: String? = null

    @Column(name = "title")
    val title: String? = null
}
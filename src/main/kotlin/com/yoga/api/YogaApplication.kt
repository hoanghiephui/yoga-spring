package com.yoga.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YogaApplication

fun main(args: Array<String>) {
    runApplication<YogaApplication>(*args)
}

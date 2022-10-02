package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class ChuckNorrisFactsApplication

fun main(args: Array<String>) {
    runApplication<ChuckNorrisFactsApplication>(*args)
}

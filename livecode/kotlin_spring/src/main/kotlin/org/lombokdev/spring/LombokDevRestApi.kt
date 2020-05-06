package org.lombokdev.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LombokDevRestApi

fun main(args: Array<String>) {
    runApplication<LombokDevRestApi>(*args)
}


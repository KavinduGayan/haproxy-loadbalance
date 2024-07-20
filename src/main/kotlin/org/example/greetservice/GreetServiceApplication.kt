package org.example.greetservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GreetServiceApplication

fun main(args: Array<String>) {
    runApplication<GreetServiceApplication>(*args)
}


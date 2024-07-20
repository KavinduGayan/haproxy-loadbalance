package org.example.greetservice.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController

@RequestMapping("/hello")
class GreetController(private val environment: Environment) {

    @GetMapping("/")
    fun sayHello(): String = "say hello from " + environment.getProperty("server.port")

}
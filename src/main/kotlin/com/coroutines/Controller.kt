package com.coroutines

import io.micronaut.context.annotation.Parameter
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class Controller {

    @Get("test")
    suspend fun getTest(@Parameter text: String): String {
        return text
    }

}
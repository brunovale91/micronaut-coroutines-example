package com.coroutines

import io.micronaut.context.annotation.Parameter
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.validation.Validated

@Controller
@Validated
class ControllerValidated {

    @Get("testValidated")
    suspend fun getTest(@Parameter text: String): String {
        return text
    }

}
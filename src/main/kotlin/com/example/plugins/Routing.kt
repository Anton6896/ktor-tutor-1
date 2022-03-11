package com.example.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val res = userResponse(name = "name1", data = "some data")
            call.response.headers.append("foo", "bar")
            call.respond(res)
        }
    }
}

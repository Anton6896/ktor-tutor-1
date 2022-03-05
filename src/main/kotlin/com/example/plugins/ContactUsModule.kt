package com.example.plugins

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.contactUsModule() {
    routing {
        get("/contact_us") {
            println("uri : ${call.request.uri}")
            println("headers: ${call.request.headers.names()}")
            println("User-Agent : ${call.request.headers["User-Agent"]}")
            println("query params : ${call.request.queryParameters.names()}")

            call.respond("contact us mesage")
        }


    }
}
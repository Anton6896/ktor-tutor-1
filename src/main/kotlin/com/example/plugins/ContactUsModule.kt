package com.example.plugins

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.contactUsModule() {
    routing {
        get("/contact_us/{user_id}") {
            log.info("uri : ${call.request.uri}")
            log.info("headers: ${call.request.headers.names()}")
            log.info("User-Agent : ${call.request.headers["User-Agent"]}")
            log.info("query params : ${call.request.queryParameters["name"] ?: "noname"}")

            /*
            the url params is coming in different types so in backend must create validation
            */

            call.respond(
                "contact us mesage: \n" +
                        "url params: ${call.parameters["user_id"]}\n" +
                        "username: ${call.request.queryParameters["name"] ?: "noname"}"
            )
        }
    }
}
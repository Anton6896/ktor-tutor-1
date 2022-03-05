package com.example.plugins

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.contactUsModule() {
    routing {
        get("/contact_us"){
            call.respond("contact us mesage")
        }
    }
}
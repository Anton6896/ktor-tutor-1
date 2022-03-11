package com.example

import io.ktor.application.*
import com.example.plugins.*
import io.ktor.features.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.serialization.json.Json

//fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
//
//@Suppress("unused")
//fun Application.module() {
//    configureRouting()
//    contactUsModule()
//}


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        // as middleware
        install(CallLogging)
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }

        configureRouting()
        contactUsModule()

    }.start(wait = true)
}

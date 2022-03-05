package com.example

import io.ktor.application.*
import com.example.plugins.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

//fun main(args: Array<String>): Unit =
//    io.ktor.server.netty.EngineMain.main(args)
//
//@Suppress("unused")
//fun Application.module() {
//    configureRouting()
//    contactUsModule()
//}


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//        install(Routing){
//            homeRoute()
//        }
        configureRouting()
        contactUsModule()
    }.start()
}


//fun Routing.homeRoute() {
//    get("/") {
//        call.respond("Hello there ")
//    }
//}

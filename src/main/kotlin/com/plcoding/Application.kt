package com.plcoding

import io.ktor.application.*
import com.plcoding.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>): Unit {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        // ...
    }.start(wait = true)
}

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureMonitoring()
}

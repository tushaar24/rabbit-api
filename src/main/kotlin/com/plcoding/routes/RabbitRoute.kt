package com.plcoding.routes

import com.plcoding.data.model.Rabbit
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "https://randomrabbit.herokuapp.com"
private val rabbits = listOf(
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("John", "John is very active", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Neeti", "She is rude", "$BASE_URL/rabbits/rabbit4.jpg"),
)

fun Route.randomRabbit(){
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }

}
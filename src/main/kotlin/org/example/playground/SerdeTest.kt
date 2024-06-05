package org.example.playground

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Data(val a: Int, val b: String)

fun main() {
    val json = Json.encodeToString(Data(42, "str"))
    println(json)
    val dataList = listOf(Data(42, "str"), Data(12, "test"))
    val jsonList = Json.encodeToString(dataList)
    println(jsonList)
    val obj = Json.decodeFromString<Data>("""{"a":42, "b": "str"}""")
    println(obj.a)
    println(obj.b)
}
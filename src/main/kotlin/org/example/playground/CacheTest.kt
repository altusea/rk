package org.example.playground

import io.github.reactivecircus.cache4k.Cache
import kotlin.time.DurationUnit
import kotlin.time.toDuration

fun main() {
    val cache = Cache.Builder<String, Int>()
        .expireAfterWrite(10.toDuration(DurationUnit.MINUTES))
        .build()

    cache.put("dog", 1)
    cache.put("cat", 2)
    println(cache.get("cat"))
    println(cache.get("dog"))
}
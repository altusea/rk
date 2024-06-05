package org.example.playground

import arrow.core.memoize
import kotlin.time.DurationUnit
import kotlin.time.toDuration

fun expensive(x: Int): Int {
    // fake it by sleeping the thread
    Thread.sleep(x * 100L)
    return x
}

val memoizedExpensive = ::expensive.memoize()

fun main() {
    val t1 = System.currentTimeMillis()
    val result1 = memoizedExpensive(3)
    val t2 = System.currentTimeMillis()
    val result2 = memoizedExpensive(3)
    val t3 = System.currentTimeMillis()
    println(t2.minus(t1).toDuration(DurationUnit.MILLISECONDS))
    println(t3.minus(t2).toDuration(DurationUnit.MILLISECONDS))
}

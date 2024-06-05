package org.example.playground

import arrow.core.Either
import arrow.core.Option
import arrow.core.raise.either
import arrow.core.raise.ensure

data class MyError(val message: String)

fun isPositive(i: Int): Either<MyError, Int> = either {
    ensure(i > 0) { MyError("$i is not positive") }
    i
}

fun main() {
    val a = Option.fromNullable(null)
    println(a)
    val b = Option.fromNullable("hello")
    println(b)

    val c = isPositive(2)
    println(c)
    val d = isPositive(-1)
    println(d)
}

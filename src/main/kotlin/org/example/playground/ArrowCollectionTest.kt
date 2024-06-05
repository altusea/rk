package org.example.playground

import arrow.core.nonEmptyListOf

fun divide(x: Int, y: Int): Double = x.toDouble() / y.toDouble()

//val averageCollector = zip(Collectors.sum, Collectors.length, ::divide)

fun main() {
    val a = nonEmptyListOf("A", "B", "C", "D", "E", "F", "G", "H")
    val b = a.zipWithNext()
    println(b)

    val c = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    c[4] = "D"
    println(c)
}
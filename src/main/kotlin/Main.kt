package me.play

fun <E, R> map(a: List<E>, mapping: (E) -> R): List<R> {
    return a.map { mapping(it) }
}

fun main() {
    println("Hello World!")

    val a = listOf(1, 2, 3)
    val b = map(a, { e -> e * 2 })
    println(b)
}

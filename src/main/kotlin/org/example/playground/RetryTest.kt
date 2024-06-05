package org.example.playground

import arrow.fx.coroutines.Schedule

fun <A> recurTenTimes() = Schedule.recurs<A>(10)
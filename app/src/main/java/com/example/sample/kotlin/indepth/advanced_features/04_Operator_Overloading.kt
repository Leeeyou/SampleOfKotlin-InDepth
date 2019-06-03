package com.example.sample.kotlin.indepth.advanced_features

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.unaryPlus() = Point(+x, +y)

val point = Point(10, 20)

fun main() {
    println(-point)  // prints "Point(x=-10, y=-20)"
    println(+point)  // prints "Point(x=-10, y=-20)"

    val listOf = listOf("深圳", "孟加拉", "拉斯维加斯")
    val myCity = "拉斯维加斯"
    println(myCity in listOf)

    println(listOf.get(0))
    println(listOf[1])
}
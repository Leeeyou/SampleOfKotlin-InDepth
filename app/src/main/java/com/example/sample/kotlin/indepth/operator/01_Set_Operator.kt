package com.example.sample.kotlin.indepth.operator

import com.example.sample.kotlin.indepth.other.bean.UserInfo
import kotlin.random.Random

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))

    println(numbers.takeWhile { !it.startsWith('f') })
    println(numbers.takeLastWhile { it != "three" })
    println(numbers.dropWhile { it.length == 3 })
    println(numbers.dropLastWhile { it.contains('i') })
    println("---")

    println(numbers.chunked(3))
    println(numbers.windowed(3))
    println("---")

    val letters = ('a'..'f').toList()
    val pairs = letters.zipWithNext()

    println(letters) // [a, b, c, d, e, f]
    println(pairs) // [(a, b), (b, c), (c, d), (d, e), (e, f)]
    println("---")

    println(numbers.elementAtOrNull(10))
    println(numbers.elementAtOrElse(10) { index -> "The value for index $index is undefined" })
    println("---")

    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
    println(listOf("aaa", "bb", "c").sortedWith(lengthComparator))
    println("---")

    val sortedNumbers = numbers.sortedBy { it.length }
    println("Sorted by length ascending: $sortedNumbers")
    val sortedByLast = numbers.sortedByDescending { it.last() }
    println("Sorted by the last letter descending: $sortedByLast")
    println("---")

    val containers = listOf(
        listOf("one", "two", "three"),
        listOf("four", "five", "six"),
        listOf("seven", "eight"),
        listOf("apple", "Banana", "Grape", "Melon")
    )
    println(containers.flatMap {
        it.filter { list -> list.contains("e") && list.length > 3 }.map { value ->
            UserInfo(
                Random.nextInt(90870, 1009983),
                "Se${Random.nextInt(876)}",
                "http://oioe.i/23.png",
                Random.nextInt(0, 5),
                Random.nextInt(0, 2),
                Random.nextLong(17789876555, 17789879555).toString(),
                "hello $value"
            )
        }
    })
}
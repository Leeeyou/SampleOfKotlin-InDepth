package com.example.sample.kotlin.indepth.other

import com.example.sample.kotlin.indepth.other.bean.UserInfo

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))

//    println(numbers.takeWhile { !it.startsWith('f') })
//    println(numbers.takeLastWhile { it != "three" })
//    println(numbers.dropWhile { it.length == 3 })
//    println(numbers.dropLastWhile { it.contains('i') })

//    val numbers = (0..13).toList()
//    println(numbers.chunked(3))
//    println(numbers.windowed(3))

//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.elementAtOrNull(5))
//    println(numbers.elementAtOrElse(5) { index -> "The value for index $index is undefined"})
//
//    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
//    println(listOf("aaa", "bb", "c").sortedWith(lengthComparator))
//
//    val sortedNumbers = numbers.sortedBy { it.length }
//    println("Sorted by length ascending: $sortedNumbers")
//    val sortedByLast = numbers.sortedByDescending { it.last() }
//    println("Sorted by the last letter descending: $sortedByLast")

    val user = UserInfo(9802830, "Rose", "http://oioe.i/23.png", 1, 1, "17789876555")
    user.takeIf { it.nickname?.length!! > 0 }?.also { println("姓名为${it.nickname}") } ?: println("姓名为空")
    user.takeUnless { it.nickname?.length!! > 0 }?.also { println("姓名为空") } ?: println("姓名为${user.nickname}")

    with(user) {
        this.head = "http://oioe.i/25.png"
        this.mobile = "17789876558"
    }
    println(user)

    user.let {
        it.head = "http://oioe.i/27.png"
        it.mobile = "17789876550"
    }
    println(user)

    val block: (UserInfo).() -> Unit = { }
    val userTemp = user.apply(block)
    println(userTemp)

    val block1: (UserInfo) -> Int = { 3 }
    val userTemp2 = user.let(block1)
    println(userTemp2)

}

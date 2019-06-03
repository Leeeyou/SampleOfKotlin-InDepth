package com.example.sample.kotlin.indepth.advanced_features

enum class CompareResult {
    MORE, LESS, EQUAL
}

infix fun Int.vs(num: Int): CompareResult =
    when {
        this - num > 0 -> CompareResult.MORE
        this - num < 0 -> CompareResult.LESS
        else -> CompareResult.EQUAL
    }

fun main() {
    //自定义示例
    println(1 vs 6)
    println(9 vs 6)
    println(6 vs 6)

    //库自带中缀示例 to、step
    mapOf("深圳" to "中国", "孟加拉" to "印度")

    for (i in 1..10 step 2) {
        println(i)
    }


}


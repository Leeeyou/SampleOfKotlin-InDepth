package com.example.sample.kotlin.indepth.operator

import com.example.sample.kotlin.indepth.other.bean.UserInfo

fun main() {
    val user = UserInfo(9802830, "Rose", "http://oioe.i/23.png", 1, 1, "17789876555")

    val letResult = user.let { "let::${it.nickname}" }
    println(letResult)
    val runResult = user.run { "run::${this.mobile}" }
    println(runResult)
    println("---")

    user.also {
        println("also::${it.uid}")
    }.apply {
        println("apply::${this.gender}")
    }.nickname = "hello"
    println(user.nickname)
    println("---")

    user.nickname = "Lily"
    user.takeIf { it.nickname?.length!! > 0 }?.also { println("姓名为${it.nickname}") } ?: errorCallback()
    user.takeUnless { it.nickname?.length!! > 0 }?.also { println("姓名为空") } ?: println("姓名为${user.nickname}")
    println("---")

    with(user) {
        this.head = "http://oioe.i/25.png"
        this.mobile = "17789876558"
    }
    println(user)

}

fun errorCallback() {
    println("姓名为空")
}
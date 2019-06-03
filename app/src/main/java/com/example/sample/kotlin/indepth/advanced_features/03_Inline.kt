package com.example.sample.kotlin.indepth.advanced_features

import com.example.sample.kotlin.indepth.other.bean.UserInfo

val runnable = Runnable {
    println("runnable task...")
}

val successCallback: () -> Int = {
    println("do something task...")
    100
}

fun main() {
    //内部Lambda是不允许中断外部函数执行的
    test4(runnable::run, runnable::run)
    println("--- ---")

    //inline函数的return直接中断了外部函数的调用
    val userInfo = UserInfo(9802830, "Rose", "http://oioe.i/23.png", 1, 1, "17789876555")
    userInfo.let {
        it.mobile?.apply {
            println("$this do something background task...")
            //return
        }
    }
    println("--- ---")

    test1 {
        println("hello 1-1")
        return@test1 //可以根据实际的情况来决定是不是要执行后面的代码
        println("hello 1-1-1")
    }
    println("--- ---")

    test2(successCallback) {
        return
        println("hello 2-1")
    }
    println("--- ---")

    test3({
        println("hello 3-1")
    }, runnable::run)
}

inline fun test1(crossinline block: () -> Unit) {
    block()
    return
}

inline fun test2(noinline block1: () -> Int, block2: () -> Unit): () -> Int {
    block1.invoke()
    block2()
    println("test 2")
    return block1
}

inline fun test3(block: () -> Unit, block2: () -> Unit) {
    block.invoke()
    block2.invoke()
    println("test 3")
}

fun test4(block: () -> Unit, block2: () -> Unit) {
    block.invoke()
    block2.invoke()
    println("test 4")
}
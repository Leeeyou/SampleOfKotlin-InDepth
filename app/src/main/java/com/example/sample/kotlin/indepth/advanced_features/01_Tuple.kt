package com.example.sample.kotlin.indepth.advanced_features

import com.example.sample.kotlin.indepth.other.bean.UserInfo

fun main() {
    val map = mapOf("深圳" to "中国", "孟加拉" to "印度")
    for ((city, country) in map) {
        println("$city belongs $country")
    }

    val (uid2, nickname, _, _, _, mobile) = UserInfo(9802830, "Rose", "http://oioe.i/23.png", 1, 1, "17789876555")
    println("My nickname is $nickname，uid is $uid2 ， my mobile phone is $mobile")
}
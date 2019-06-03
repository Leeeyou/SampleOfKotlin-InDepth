package com.example.sample.kotlin.indepth.other.bean

data class UserInfo(
    var uid: Int?,
    var nickname: String?,
    var head: String?,
    var flag: Int?,
    var gender: Int?,
    var mobile: String?,
    var like: String? = "Mango"
)
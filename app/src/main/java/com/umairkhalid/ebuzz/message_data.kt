package com.umairkhalid.ebuzz

import java.io.Serializable

data class message_data(
//    val img: String?="",
    val userId: String = "",
    val messageText: String = "",
    val timestamp: Long = 0,
    val audioUrl: String? = null,
    val imageUrl: String? = null,
    val fileUrl: String? = null,
    var key: String? = ""

):Serializable
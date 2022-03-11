package com.example.plugins

import kotlinx.serialization.Serializable

class Models {
}

@Serializable
data class UserLogin(val name: String, val password: String)

@Serializable
data class userResponse(val name: String, val data: String)
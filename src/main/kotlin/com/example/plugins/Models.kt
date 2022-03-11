package com.example.plugins

import kotlinx.serialization.Serializable

class Models {
}

@Serializable
data class UserLogin(val name: String, val password: String)
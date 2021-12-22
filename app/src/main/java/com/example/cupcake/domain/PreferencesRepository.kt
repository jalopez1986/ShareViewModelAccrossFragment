package com.example.cupcake.domain

interface PreferencesRepository {
    fun set(key: String, value: String)
    fun getString(key: String): String?
}
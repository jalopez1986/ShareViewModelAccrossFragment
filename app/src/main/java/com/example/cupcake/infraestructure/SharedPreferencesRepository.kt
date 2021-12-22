package com.example.cupcake.infraestructure

import android.content.SharedPreferences
import com.example.cupcake.domain.PreferencesRepository
import javax.inject.Inject

class SharedPreferencesRepository @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : PreferencesRepository {
    override fun set(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    override fun getString(key: String): String? {
        return sharedPreferences.getString(key, "empty")
    }
}
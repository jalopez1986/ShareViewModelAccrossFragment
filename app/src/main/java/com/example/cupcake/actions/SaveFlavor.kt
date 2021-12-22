package com.example.cupcake.actions

import android.util.Log
import com.example.cupcake.domain.FlavorsRepository
import javax.inject.Inject

class SaveFlavor @Inject constructor(
    private val flavorsRepository: FlavorsRepository
) {
    init {
        Log.d("jorge","Jorge init SaveFlavor")
    }

    fun execute(flavor: String) {
        Log.d("Jorge","Jorge execute SaveFlavor Action")
        flavorsRepository.save(flavor)
    }
}
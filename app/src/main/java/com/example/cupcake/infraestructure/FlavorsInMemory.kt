package com.example.cupcake.infraestructure

import android.util.Log
import com.example.cupcake.domain.FlavorsRepository
import javax.inject.Inject

class FlavorsInMemory @Inject constructor() : FlavorsRepository {
    override fun save(flavor: String): Boolean {
        Log.d("Jorge","Jorge execute save flavorsInMemory value: $flavor")
        return true
    }
}
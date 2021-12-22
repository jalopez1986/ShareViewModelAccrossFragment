package com.example.cupcake.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cupcake.actions.SaveFlavor
import javax.inject.Inject

class OrderViewModelFactory @Inject constructor(
    private val saveFlavor: SaveFlavor
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return OrderViewModel(
            saveFlavor
        ) as T
    }
}
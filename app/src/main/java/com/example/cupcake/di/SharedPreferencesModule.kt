package com.example.cupcake.di

import android.content.Context
import androidx.preference.PreferenceManager
import com.example.cupcake.domain.PreferencesRepository
import com.example.cupcake.infraestructure.SharedPreferencesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedPreferencesModule {

    @Singleton
    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context) : PreferencesRepository {
        return SharedPreferencesRepository(PreferenceManager.getDefaultSharedPreferences(context))
    }
}
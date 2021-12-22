package com.example.cupcake.domain

interface FlavorsRepository {
    fun save(flavor: String) : Boolean
}
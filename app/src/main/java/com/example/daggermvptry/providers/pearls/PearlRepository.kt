package com.example.daggermvptry.providers.pearls

interface PearlRepository {


    fun getAllPearls():List<String>
    fun getPearlContent(pearlId:String):String
}
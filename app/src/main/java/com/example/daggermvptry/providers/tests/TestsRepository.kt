package com.example.daggermvptry.providers.tests

interface TestsRepository {
    fun getAllTests(): List<String>
    fun getTestContent(pearlId: String): String
}
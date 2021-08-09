package com.example.daggermvptry.providers.tests

import javax.inject.Inject


class TestsRepositoryImpl @Inject constructor() : TestsRepository {
    override fun getAllTests(): List<String> {
        return emptyList()
    }

    override fun getTestContent(pearlId: String): String {
        return "Some Test Content"
    }
}
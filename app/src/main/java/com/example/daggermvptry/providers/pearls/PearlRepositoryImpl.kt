package com.example.daggermvptry.providers.pearls

import javax.inject.Inject

class PearlRepositoryImpl @Inject constructor() : PearlRepository {
    override fun getAllPearls(): List<String> {
        return emptyList()
    }

    override fun getPearlContent(pearlId: String): String {
        return "Some Pearl Content"
    }
}
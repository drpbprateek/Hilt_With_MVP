package com.example.daggermvptry.ui.main

import com.example.daggermvptry.base.BasePresenter
import com.example.daggermvptry.providers.pearls.PearlRepository
import com.example.daggermvptry.providers.pearls.PearlRepositoryImpl
import com.example.daggermvptry.providers.tests.TestsRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class MainPresenter @Inject constructor(
    val view: MainContract.View,
    val pearlRepository: PearlRepository,
    val testsRepository: TestsRepository
) : BasePresenter<MainContract.View>(view), MainContract.Presenter {

    override fun onCreate() {
        view.showText(pearlRepository.getPearlContent("12"))
    }

    override fun onButtonPressed() {
        view.openSecondActivity()
    }
}
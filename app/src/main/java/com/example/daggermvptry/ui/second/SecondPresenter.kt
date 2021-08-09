package com.example.daggermvptry.ui.second

import com.example.daggermvptry.base.BasePresenter
import com.example.daggermvptry.providers.pearls.PearlRepository
import com.example.daggermvptry.providers.tests.TestsRepository
import javax.inject.Inject


class SecondPresenter @Inject constructor(
    val view: SecondContract.View,
    val pearlRepository: PearlRepository,
    val testsRepository: TestsRepository
) : BasePresenter<SecondContract.View>(view), SecondContract.Presenter {

    override fun onCreate() {
        view.inflateFragment()
    }

}
package com.example.daggermvptry.di.activity

import android.app.Activity
import com.example.daggermvptry.ui.main.MainContract
import com.example.daggermvptry.ui.main.MainPresenter
import com.example.daggermvptry.ui.second.SecondContract
import com.example.daggermvptry.ui.second.SecondPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
object PresenterModule {

    //Main Activity
    @Provides
    fun bindActivityMain(activity: Activity): MainContract.View {
        return activity as MainContract.View
    }

    @Provides
    fun bindPresenterMain(impl: MainPresenter): MainContract.Presenter {
        return impl
    }

    

    //Second Activity
    @Provides
    fun bindActivitySecond(activity: Activity): SecondContract.View {
        return activity as SecondContract.View
    }

    @Provides
    fun bindPresenterSecond(impl: SecondPresenter): SecondContract.Presenter {
        return impl
    }


}
package com.example.daggermvptry.ui.main

import com.example.daggermvptry.base.ActivityView
import com.example.daggermvptry.base.IPresenter


/**
 * Created by surjo on 04/01/18.
 */
interface MainContract {
    interface View : ActivityView {
        fun showText(str:String)
        fun openSecondActivity()
    }

    interface Presenter : IPresenter {
        fun onCreate()
        fun onButtonPressed()
    }
}
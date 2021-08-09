package com.example.daggermvptry.ui.second

import com.example.daggermvptry.base.ActivityView
import com.example.daggermvptry.base.IPresenter


/**
 * Created by surjo on 04/01/18.
 */
interface SecondContract {
    interface View : ActivityView {
        fun inflateFragment()
    }

    interface Presenter : IPresenter {
        fun onCreate()
    }
}
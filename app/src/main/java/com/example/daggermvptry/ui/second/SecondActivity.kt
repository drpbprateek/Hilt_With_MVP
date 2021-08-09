package com.example.daggermvptry.ui.second

import android.os.Bundle
import com.example.daggermvptry.R
import com.example.daggermvptry.base.BaseActivity
import com.example.daggermvptry.ui.second.ui.preview.PreviewFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondActivity : BaseActivity<SecondContract.Presenter>(), SecondContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        mPresenter.onCreate()
    }

    override fun inflateFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, PreviewFragment.newInstance())
            .commitNow()
    }
}
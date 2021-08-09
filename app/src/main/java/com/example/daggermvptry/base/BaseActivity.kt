package com.example.daggermvptry.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<P : IPresenter> : AppCompatActivity(), ActivityView {

    @Inject
    lateinit var mPresenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onStop() {
        mPresenter.onStop()
        super.onStop()
    }


    override fun onPause() {
        mPresenter.onPause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        mPresenter.onResume()
    }

    override fun onDestroy() {
        mPresenter.onDestroy()
        super.onDestroy()
    }

    override fun getStr(resId: Int): String {
        return resources.getString(resId)
    }

    override fun finishScreen() {
        finishScreen()
    }

    override fun isActivityFinishing(): Boolean {
        return false
    }

    open fun getIntentString(name: String?): String? {
        return intent.getStringExtra(name)
    }

    open fun getIntentInt(name: String?, def: Int): Int {
        return intent.getIntExtra(name, def)
    }

    open fun getIntentInt(name: String?): Int {
        return getIntentInt(name, 0)
    }

    open fun getIntentBoolean(name: String?, def: Boolean): Boolean {
        return intent.getBooleanExtra(name, def)
    }

    open fun getIntentBoolean(name: String?): Boolean {
        return getIntentBoolean(name, false)
    }
}
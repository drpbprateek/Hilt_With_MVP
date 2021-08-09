package com.example.daggermvptry.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.daggermvptry.R
import com.example.daggermvptry.base.BaseActivity
import com.example.daggermvptry.ui.second.SecondActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<MainContract.Presenter>(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            mPresenter.onButtonPressed()
        }
    }

    override fun showText(str: String) {
        findViewById<TextView>(R.id.textView).text = str
    }

    override fun openSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
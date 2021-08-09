package com.example.daggermvptry.ui.second.ui.preview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.daggermvptry.R

class PreviewFragment : Fragment() {

    companion object {
        fun newInstance() = PreviewFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.preview_fragment, container, false)
    }
}
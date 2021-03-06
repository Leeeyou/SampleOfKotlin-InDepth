package com.example.sample.kotlin.indepth.other.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.sample.kotlin.indepth.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })

        val setOperatorTextView: TextView = root.findViewById(R.id.text_set_operator)
        setOperatorTextView.setOnClickListener {
            //https://juejin.im/post/5b1f7699f265da6e155d5965#heading-5

            val list = arrayListOf('a', 'b', 'c', 'd', 'e', 'f', 'g')
            list.map { it - 'c' }.filter { it > 0 }.forEach {
                Log.d("HomeFragment", it.toString())
            }
        }

        return root
    }
}
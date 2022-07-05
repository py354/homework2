package com.example.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.findNavController

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn1)
        button.setOnClickListener{
            val bundle = bundleOf(CLASS_NAME_PARAM to this::class.toString())
            view.findNavController().navigate(R.id.action_fragment1_to_fragment6, bundle)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = Fragment1()
    }
}
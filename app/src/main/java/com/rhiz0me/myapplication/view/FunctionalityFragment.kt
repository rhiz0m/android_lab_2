package com.rhiz0me.myapplication.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.rhiz0me.myapplication.R
import com.rhiz0me.myapplication.databinding.FragmentFunctionalityBinding


class FunctionalityFragment : Fragment() {

    private lateinit var binding: FragmentFunctionalityBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Setup viewBinding
        binding = FragmentFunctionalityBinding.inflate(layoutInflater,  container, false)
        val view = binding.root

        //ID's

        val btnHome = binding.btnHome
        val btnListGenarator = binding.listGenerator

        //Onclick

        btnHome.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_functionalityFragment_to_homeFragment)
        }
        return view
    }

}
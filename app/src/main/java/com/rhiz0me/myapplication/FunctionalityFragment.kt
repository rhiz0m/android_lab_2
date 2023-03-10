package com.rhiz0me.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rhiz0me.myapplication.databinding.FragmentAboutBinding
import com.rhiz0me.myapplication.databinding.FragmentFunctionalityBinding


class FunctionalityFragment : Fragment() {

    lateinit var binding: FragmentFunctionalityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Setup viewBinding
        binding = FragmentFunctionalityBinding.inflate(layoutInflater,  container, false)
        val view = binding.root

        //ID's

        val btnHome = binding.btnHome

        //Onclick

        btnHome.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_functionalityFragment_to_homeFragment)
        }

        return view
    }

}
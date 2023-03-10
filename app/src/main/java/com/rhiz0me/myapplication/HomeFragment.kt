package com.rhiz0me.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rhiz0me.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Setup viewBinding
        binding = FragmentHomeBinding.inflate(layoutInflater,  container, false)
        val view = binding.root

        //ID's

        val btnAbout = binding.btnAbout
        val btnFunctionality = binding.btnFunctionality
        val btnNews = binding.btnNews
        //Onclick

        btnAbout.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_aboutFragment)
        }

        btnFunctionality.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_functionalityFragment)
        }

        btnNews.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_newsletterFragment)
        }

        return view
    }

}
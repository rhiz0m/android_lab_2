package com.rhiz0me.myapplication

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation
import com.rhiz0me.myapplication.databinding.FragmentAboutBinding
import com.rhiz0me.myapplication.databinding.FragmentNewsletterBinding


class NewsletterFragment : Fragment() {

    private lateinit var binding: FragmentNewsletterBinding
    private var emailArr = arrayListOf<Editable>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Setup viewBinding
        binding = FragmentNewsletterBinding.inflate(layoutInflater,  container, false)
        val view = binding.root

        //ID's

        val btnHome = binding.btnHome
        val btnEmailNews = binding.btnEmailNews
        var getMail = binding.enterEmail.text

        emailArr.add(getMail)

        //Onclick

        btnHome.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_newsletterFragment_to_homeFragment)
        }

        btnEmailNews.setOnClickListener() {
           for (item in emailArr) {

               binding.showEmail.text = "Your email is: $item"

            }
        }

        return view
    }


}
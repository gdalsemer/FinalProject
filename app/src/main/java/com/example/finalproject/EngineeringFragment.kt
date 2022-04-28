package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import androidx.navigation.fragment.findNavController

class EngineeringFragment : Fragment() {

    companion object{
        var url : String = ""
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_engineering, container, false)
        val button = view.findViewById<Button>(R.id.nextPage)
        button.setOnClickListener(){
           //This url companion object is used to redirect the user to a webpage.
            // This object can be updated depending on which button it is updated inside.
            url = "https://www.google.com/"

        findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val aviation = view.findViewById<Button>(R.id.Button2)
        aviation.setOnClickListener(){
            url = "https://www.pct.edu/academics/et/aviation"

            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        return view
    }


}

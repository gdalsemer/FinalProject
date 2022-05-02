package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SchoolFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_school, container, false)

        val engineeringButton = view.findViewById<Button>(R.id.EngineeringButton)
        engineeringButton.setOnClickListener(){
            findNavController().navigate(R.id.action_schoolFragment_to_engineeringFragment)
        }

        val nursingButton = view.findViewById<Button>(R.id.NursingButton)
        nursingButton.setOnClickListener(){
            findNavController().navigate(R.id.action_schoolFragment_to_healthFragment)
        }

        val businessButton = view.findViewById<Button>(R.id.BusinessButton)
        businessButton.setOnClickListener(){
            findNavController().navigate(R.id.action_schoolFragment_to_businessFragment)
        }

        return view
    }

}
package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HealthFragment : Fragment() {

    companion object{
        var url : String = ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_health, container, false)

        val nurseButton = view.findViewById<Button>(R.id.NursingButton)
        nurseButton.setOnClickListener(){
            HealthFragment.url = "https://www.pct.edu/academics/nhs/nursing"
            findNavController().navigate(R.id.action_healthFragment_to_urlFragment)
        }

        val dentalButton = view.findViewById<Button>(R.id.dental)
        dentalButton.setOnClickListener(){
            HealthFragment.url = "https://www.pct.edu/catalog/majors/DH#catalog_Curriculum"
            findNavController().navigate(R.id.action_healthFragment_to_urlFragment)
        }

        val paramedicButton = view.findViewById<Button>(R.id.paramedic)
        paramedicButton.setOnClickListener(){
            HealthFragment.url = "https://www.pct.edu/catalog/majors/PX#catalog_Curriculum"
            findNavController().navigate(R.id.action_healthFragment_to_urlFragment)
        }

        val healthScienceButton = view.findViewById<Button>(R.id.healthSciences)
        healthScienceButton.setOnClickListener(){
            HealthFragment.url = "https://www.pct.edu/catalog/majors/BSH#catalog_Curriculum"
            findNavController().navigate(R.id.action_healthFragment_to_urlFragment)
        }

        val physicalTherapistButton = view.findViewById<Button>(R.id.physicalTherapy)
        physicalTherapistButton.setOnClickListener(){
            HealthFragment.url = "https://www.pct.edu/catalog/majors/TP#catalog_Curriculum"
            findNavController().navigate(R.id.action_healthFragment_to_urlFragment)
        }

        val radiographyButton = view.findViewById<Button>(R.id.radiography)
        radiographyButton.setOnClickListener(){
            HealthFragment.url = "https://www.pct.edu/catalog/majors/RD#catalog_Curriculum"
            findNavController().navigate(R.id.action_healthFragment_to_urlFragment)
        }

        /*
        NEED TO PUT BUTTON TO TRAVEL TO NEW FRAGMENTS
        ALSO NEED BUTTONS TO SELECT MAJORS for Health Services
         */

        return view
    }
}
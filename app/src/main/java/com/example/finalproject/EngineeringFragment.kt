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

        val aviation = view.findViewById<Button>(R.id.Button2)
        aviation.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/AD#catalog_Curriculum"

            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val appliedTechButton = view.findViewById<Button>(R.id.appliedTech)
        appliedTechButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/BAT#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val architectureButton = view.findViewById<Button>(R.id.architecture)
        architectureButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/ASD#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val autoManuButton = view.findViewById<Button>(R.id.automatedManufacture)
        autoManuButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/AF#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val roboticsButton = view.findViewById<Button>(R.id.robotics)
        autoManuButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/AER#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val automotiveTechButton = view.findViewById<Button>(R.id.automotiveTech)
        automotiveTechButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/AU#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val buildingConstructionButton = view.findViewById<Button>(R.id.buildingConstruction)
        buildingConstructionButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/CB#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val civilEngButton = view.findViewById<Button>(R.id.civilEngineeringTech)
        civilEngButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/CT#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val constructionManagementButton = view.findViewById<Button>(R.id.constructionManage)
        constructionManagementButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/BCM#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val dieselTechButton = view.findViewById<Button>(R.id.dieselTech)
        dieselTechButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/DD#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val electricalConButton = view.findViewById<Button>(R.id.electricalConstruction)
        electricalConButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/EB#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val electricalTechnologyButton = view.findViewById<Button>(R.id.electricalTechnology)
        electricalConButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/EL#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val HVACButton = view.findViewById<Button>(R.id.HVAC)
        HVACButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/HV#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val cyberSecurityButton = view.findViewById<Button>(R.id.cyberSecurity)
        cyberSecurityButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/BCS#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val networkingButton = view.findViewById<Button>(R.id.networking)
        networkingButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/NS#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val softwareDevelopmentButton = view.findViewById<Button>(R.id.softwareDevelopment)
        softwareDevelopmentButton.setOnClickListener(){
            url = "https://www.pct.edu/catalog/majors/BSI#catalog_Curriculum"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        val weldingButton = view.findViewById<Button>(R.id.welding)
        weldingButton.setOnClickListener(){
            url = "https://www.pct.edu/academics/et/welding-metal-fabrication/welding"
            findNavController().navigate(R.id.action_engineeringFragment_to_urlFragment)
        }

        return view
    }


}

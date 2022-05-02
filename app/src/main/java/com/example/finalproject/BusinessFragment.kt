package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BusinessFragment : Fragment() {

    companion object{
        var url : String = ""
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_business, container, false)


        val accountingButton = view.findViewById<Button>(R.id.accounting)
        accountingButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/BSA#catalog_Curriculum"

            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val bakingButton = view.findViewById<Button>(R.id.baking)
        bakingButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/BK#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val brewingButton = view.findViewById<Button>(R.id.Brewing)
        brewingButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/BFS#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val businessManagementButton = view.findViewById<Button>(R.id.BusinessManagement)
        businessManagementButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/BM#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val businessAdminButton = view.findViewById<Button>(R.id.BusinessAdmin)
        businessAdminButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/BUA#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val culinaryArtsButton = view.findViewById<Button>(R.id.culinaryArts)
        culinaryArtsButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/CY#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val graphicDesignButton = view.findViewById<Button>(R.id.graphicDesign)
        graphicDesignButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/BGD#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        val humanServicesButton = view.findViewById<Button>(R.id.humanServices)
        humanServicesButton.setOnClickListener(){
            BusinessFragment.url = "https://www.pct.edu/catalog/majors/HJ#catalog_Curriculum"
            findNavController().navigate(R.id.action_businessFragment_to_urlFragment)
        }

        return view
    }
    /*
    Need to create two compainon objects.
    One needs to hold url for the associated Major.
    One needs to hold the correct number for the IF statement in the URLFragment to call from the correct object, get the right url, and send it to the WEBVIEWER
     */
}
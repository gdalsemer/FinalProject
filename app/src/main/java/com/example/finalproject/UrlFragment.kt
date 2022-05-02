package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class UrlFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {

            val view = inflater.inflate(R.layout.fragment_url, container, false)
            val webView = view.findViewById<WebView>(R.id.webView)

            webView.webViewClient = WebViewClient()

        /*
        These if statements are used to determine which url to load in the webView.
        The system checks to see if there is anything passed into the values gotten from the other
        fragments and then moves onto the next one to check if there is anything in the others.

        These values are then result to "" to avoid any collision issues with the webViewer
         */
            if(EngineeringFragment.url  != ""){
                webView.clearCache(true)
                webView.loadUrl("${EngineeringFragment.url}")
                EngineeringFragment.url = ""
            }
            if(BusinessFragment.url != ""){
                webView.clearCache(true)
                webView.loadUrl("${BusinessFragment.url}")
                BusinessFragment.url = ""
            }
            if(HealthFragment.url != ""){
                webView.clearCache(true)
                webView.loadUrl("${HealthFragment.url}")
                HealthFragment.url = ""
            }
            webView.settings.javaScriptEnabled = true
            webView.settings.setSupportZoom(true)
            return view
        }
    }

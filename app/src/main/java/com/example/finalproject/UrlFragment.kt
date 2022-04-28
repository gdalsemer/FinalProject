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
            webView.loadUrl("${EngineeringFragment.url}")
            webView.settings.javaScriptEnabled = true
            webView.settings.setSupportZoom(true)
            return view
        }
    }

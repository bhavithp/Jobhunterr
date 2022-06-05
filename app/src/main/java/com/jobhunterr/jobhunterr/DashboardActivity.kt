package com.jobhunterr.jobhunterr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_dashboard.*



class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        webViewSetup()
    }

    private fun webViewSetup() {
        web_View.webViewClient = WebViewClient()

        web_View.apply {
            loadUrl("https://www.google.co.in/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }

    override fun onBackPressed() {
        if(web_View.canGoBack()) web_View.goBack() else
            super.onBackPressed()
    }



}
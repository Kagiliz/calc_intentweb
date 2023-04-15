package com.emobilis.calintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WebActivity2 : AppCompatActivity() {
    lateinit var mywebview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web2)
        mywebview=findViewById(R.id.webView)
        webview()
    }
    private fun webview(){

        mywebview.webViewClient=WebViewClient()
        mywebview.apply{
            loadUrl("https://www,youtube.com/")
            settings.javaScriptEnabled=true
            setings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (mywebview.canGoBack())mywebview.goBack()else
        super.onBackPressed()
    }
}
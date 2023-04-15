package com.emobilis.calintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonintent:Button
    lateinit var Buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_calculator)
        Buttonintent=findViewById(R.id.Btn_intent)
        Buttonweb=findViewById(R.id.Btn_web)
        Buttoncalc.setOnClickListener {
            val intent=Intent(this,CalculatorActivity2::class.java)
            startActivity(intent)
        }
        Buttonintent.setOnClickListener {
            val intent=Intent(this,IntentActivity2::class.java)
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val intent=Intent(this,WebActivity2::class.java)
            startActivity(intent)
        }
    }
}
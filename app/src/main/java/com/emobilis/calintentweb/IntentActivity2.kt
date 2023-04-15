package com.emobilis.calintentweb

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class IntentActivity2 : AppCompatActivity() {
    lateinit var buttonsms:Button
    lateinit var buttoncall:Button
    lateinit var buttoncamera:Button
    lateinit var buttonshare:Button
    lateinit var buttonstk:Button
    lateinit var buttondial:Button
    lateinit var buttonemail:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)
        buttonsms=findViewById(R.id.Btn_sms)
        buttoncall=findViewById(R.id.Btn_call)
        buttoncamera=findViewById(R.id.Btn_camera)
        buttonshare=findViewById(R.id.Btn_share)
        buttonstk=findViewById(R.id.Btn_mpesa)
        buttondial=findViewById(R.id.Btn_dial)
        buttonemail=findViewById(R.id.Btn_email)
        buttonsms.setOnClickListener {
            val uri = Uri.parse("sms to: 0733938933")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("Hello", "Good Morning")
            startActivity(intent)
        }

        buttoncamera.setOnClickListener {
            val takePicture=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePicture,1)

        }
        buttonshare.setOnClickListener {
            val shareIntent=Intent(Intent.ACTION_SENDTO)
            shareIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hi,click to download")
            startActivity(shareIntent)
        }
        buttonstk.setOnClickListener {
            val simToolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
        simToolKitLaunchIntent?.let { startActivity(it) }
        }
        buttondial.setOnClickListener {
            val nambari="*254748373937"
            val intent=Intent(Intent.ACTION_DIAL,Uri.fromParts('tel',nambari,null))
            startActivity(intent)
        }
        buttonemail.setOnClickListener {
            val emailintent=Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","ekagimbi5@gmail.com",null))
            emailintent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailintent.putExtra(Intent.EXTRA_TEXT,"Body")
            startActivity(Intent.createChooser(emailintent,"send email___"))
        }

        buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))
            if (ContextCompact.checkSelfPermission(this@IntentActivity2,Manifest.permission.CALL_PHONE
                    this@IntentActivity2,
                    Manifest.permission.CALL_PHONE
                ) !=android.content.PackageManager.PERMISSION_GRANTED
            ) {
                ContextCompact.requestPermissions(
                    this@IntentActivity2,
                    arrayOf(Manifest.permission.CALL_PHONE),

                )
            } else {
                startActivity(intent)
            }


        }
    }
}
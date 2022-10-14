package com.example.intenttest2

import android.content.Intent
import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            callB.setOnClickListener {
                val callOn = Intent(Intent.ACTION_DIAL)

                callOn.data = parse("tel:774504901")

                startActivity(callOn)


            }

        email_sendB.setOnClickListener {
            val email=Intent(Intent.ACTION_SENDTO)
            email.data= parse("mailto:")
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf("fwedhepa@gmail.com"))
            email.putExtra(Intent.EXTRA_SUBJECT,"weolcome")
            email.putExtra(Intent.EXTRA_TEXT,"hi fuad")

            startActivity(email)
        }

        open_broserB.setOnClickListener {
            val open=Intent(Intent.ACTION_VIEW)
            open.data= parse("https://developer.android.com/guide/components/intents")

            startActivity(open)
        }




    }






}
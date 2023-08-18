package com.example.autoinsight

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.autoinsight.ContactActivity.Companion.a
import com.example.autoinsight.ContactActivity.Companion.b
import com.example.autoinsight.ContactActivity.Companion.c
import com.example.autoinsight.ContactActivity.Companion.d
import com.example.autoinsight.ContactActivity.Companion.e
import com.example.autoinsight.ContactActivity.Companion.f

class PersonalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal)

        a = this.findViewById(R.id.firstName)
        b = this.findViewById(R.id.lastName)
        c = this.findViewById(R.id.houseNo)
        d = this.findViewById(R.id.city)
        e = this.findViewById(R.id.state)
        f = this.findViewById(R.id.pinCode)

        val pnextButton = this.findViewById<Button>(R.id.pnextButton)

        pnextButton.setOnClickListener {
            if (a.text.toString().isEmpty() || b.text.toString().isEmpty() || c.text.toString()
                    .isEmpty() || d.text.toString().isEmpty() || e.text.toString()
                    .isEmpty() || f.text.toString().isEmpty()
            ) {
                Toast.makeText(applicationContext, "Please fill all the mandatory * fields.", Toast.LENGTH_SHORT)
                    .show()
            }
            else {
                val intent = Intent(this, CarActivity::class.java).apply {
                }
                startActivity(intent)
            }
        }


        val logout = this.findViewById<ImageView>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}
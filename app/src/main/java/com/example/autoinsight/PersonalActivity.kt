package com.example.autoinsight

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PersonalActivity : AppCompatActivity() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var a: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var b: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var c: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var d: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var e: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var f: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var g: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var h: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var i: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var j: EditText
        @SuppressLint("StaticFieldLeak")
        lateinit var k: EditText
    }

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
    }
}
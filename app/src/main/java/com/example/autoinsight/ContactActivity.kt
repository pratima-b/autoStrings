package com.example.autoinsight

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.autoinsight.PersonalActivity.Companion.j
import com.example.autoinsight.PersonalActivity.Companion.k
import com.hbb20.CountryCodePicker


class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val ccp: CountryCodePicker = this.findViewById(R.id.countryCodeHolder)
        j = this.findViewById(R.id.mobile)
        k = this.findViewById(R.id.email)

        ccp.registerCarrierNumberEditText(j)

        val verify = this.findViewById<Button>(R.id.verify)
        verify.setOnClickListener {
            if (j.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please fill the mandatory * field.",
                    Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this, OtpActivity::class.java).apply {
                }
                startActivity(intent)
            }
        }
    }
}
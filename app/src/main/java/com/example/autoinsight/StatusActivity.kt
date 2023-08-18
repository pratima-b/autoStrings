package com.example.autoinsight

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageView
import android.widget.Toast
import com.example.autoinsight.ContactActivity.Companion.a
import com.example.autoinsight.ContactActivity.Companion.b
import com.example.autoinsight.ContactActivity.Companion.c
import com.example.autoinsight.ContactActivity.Companion.d
import com.example.autoinsight.ContactActivity.Companion.e
import com.example.autoinsight.ContactActivity.Companion.f
import com.example.autoinsight.ContactActivity.Companion.g
import com.example.autoinsight.ContactActivity.Companion.h
import com.example.autoinsight.ContactActivity.Companion.i
import com.example.autoinsight.ContactActivity.Companion.j
import com.example.autoinsight.ContactActivity.Companion.k
import com.example.autoinsight.ContactActivity.Companion.l
import com.example.autoinsight.ContactActivity.Companion.m


class StatusActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        val services = resources.getStringArray(R.array.services)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown, services)
        val serviceDone = findViewById<AutoCompleteTextView>(R.id.serviceDone)
        serviceDone.setAdapter(arrayAdapter)

        val doneWhere = resources.getStringArray(R.array.doneWhere)
        val arrayAdapter1: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, doneWhere)
        val where = findViewById<AutoCompleteTextView>(R.id.where)
        where.setAdapter(arrayAdapter1)

        val scheduledWhen = resources.getStringArray(R.array.scheduledWhen)
        val arrayAdapter2: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, scheduledWhen)
        val whenScheduled = findViewById<AutoCompleteTextView>(R.id.whenScheduled)
        whenScheduled.setAdapter(arrayAdapter2)

        val doneOften = resources.getStringArray(R.array.doneWhere)
        val arrayAdapter3: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, doneOften)
        val often = findViewById<AutoCompleteTextView>(R.id.often)
        often.setAdapter(arrayAdapter3)

        val avg = resources.getStringArray(R.array.avg)
        val arrayAdapter4: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, avg)
        val avgRunning = findViewById<AutoCompleteTextView>(R.id.avgRunning)
        avgRunning.setAdapter(arrayAdapter4)

        val logout = this.findViewById<ImageView>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java).apply {
            }
            startActivity(intent)
        }

        val dbHelper = DBHelper(applicationContext)

        dbHelper.addData(
            j.text.toString(),
            a.text.toString(),
            b.text.toString(),
            c.text.toString(),
            d.text.toString(),
            e.text.toString(),
            f.text.toString(),
            g.text.toString(),
            h.text.toString(),
            i.text.toString(),
            k.text.toString(),
            l.text.toString(),
            m.text.toString()
        )

        Toast.makeText(
            applicationContext,
            "data added",
            Toast.LENGTH_SHORT)
            .show()

    }
}
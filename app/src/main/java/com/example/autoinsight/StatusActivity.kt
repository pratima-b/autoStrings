package com.example.autoinsight

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

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

        /*val scheduledWhen = resources.getStringArray(R.array.scheduledWhen)
        val arrayAdapter2: ArrayAdapter<String> = ArrayAdapter(this, R.layout.dropdown, scheduledWhen)
        val whenScheduled = findViewById<AutoCompleteTextView>(R.id.whenScheduled)
        where.setAdapter(arrayAdapter2)*/

    }
}
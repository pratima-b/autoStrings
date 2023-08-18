package com.example.autoinsight

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.autoinsight.PersonalActivity.Companion.a
import com.example.autoinsight.PersonalActivity.Companion.b
import com.example.autoinsight.PersonalActivity.Companion.c
import com.example.autoinsight.PersonalActivity.Companion.d
import com.example.autoinsight.PersonalActivity.Companion.e
import com.example.autoinsight.PersonalActivity.Companion.f
import com.example.autoinsight.PersonalActivity.Companion.g
import com.example.autoinsight.PersonalActivity.Companion.h
import com.example.autoinsight.PersonalActivity.Companion.i
import com.example.autoinsight.PersonalActivity.Companion.j
import com.example.autoinsight.PersonalActivity.Companion.k
import java.util.Timer
import java.util.TimerTask


class OtpActivity : AppCompatActivity() {

    private lateinit var resendTextView: TextView
    private lateinit var countDownTimer: CountDownTimer
    var resendEnabled: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val verify = this.findViewById<Button>(R.id.verify)
        verify.setOnClickListener {
            val intent = Intent(this, PersonalActivity::class.java).apply {
            }
            startActivity(intent)
        }

        resendTextView = findViewById(R.id.resendTextView)
        startCountdownTimer()

        /*val dbHelper = DBHelper(applicationContext)

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
            k.text.toString()
        )

        Toast.makeText(
            applicationContext,
            "data added",
            Toast.LENGTH_SHORT)
            .show()*/

    }
    private fun startCountdownTimer() {

        resendEnabled = false
        resendTextView.setTextColor(Color.parseColor("#99000000"))

        countDownTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsLeft = millisUntilFinished / 1000
                resendTextView.setText("Resend OTP ("+secondsLeft+")")
            }

            override fun onFinish() {
                resendEnabled = true
                resendTextView.setText("Resend OTP")
                resendTextView.setTextColor(resources.getColor(R.color.blue))
            }
        }
        countDownTimer.start()
    }
}
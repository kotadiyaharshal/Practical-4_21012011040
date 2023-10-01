package com.example.mad_practical_4_21012011040

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad_practical_4_21012011072.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup: Button = findViewById(R.id.signup)
        signup.setOnClickListener {
            Intent(this,RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}
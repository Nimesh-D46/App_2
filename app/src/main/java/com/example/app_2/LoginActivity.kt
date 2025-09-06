package com.example.app_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn: Button = findViewById(R.id.logIN)
        val forgetPassword: Button = findViewById(R.id.forgetPW)
        val registerBtn: Button = findViewById(R.id.new_member)
        loginBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        forgetPassword.setOnClickListener {
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
        registerBtn.setOnClickListener {
            val intent=Intent(this, StudentRegistration::class.java)
            startActivity(intent)
        }

    }
}

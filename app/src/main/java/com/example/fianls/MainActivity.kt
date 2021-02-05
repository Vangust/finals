package com.example.fianls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var inputEmail: EditText
    private lateinit var inputPassword: EditText
    private lateinit var signInButton:Button
    private lateinit var registrationButton: Button
    private lateinit var passwordRecoveryButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()

        inputEmail = findViewById(R.id.signInEditText)
        inputPassword = findViewById(R.id.signInEditTextPasssword)
        signInButton = findViewById(R.id.signInButton)
        registrationButton = findViewById(R.id.registrationButton)
        passwordRecoveryButton = findViewById(R.id.passwordRecoveryButton)

        signInButton.setOnClickListener{
            val email =inputEmail.text.toString()
            val password=inputPassword.text.toString()

            if(email.isEmpty()||password.isEmpty()){
                Toast.makeText(this,"Email and password required", Toast.LENGTH_SHORT).show()
            } else {
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        startActivity(Intent(this, UserActivity::class.java))
                        finish()
                    } else{
                        Toast.makeText(this,"Wrong email or password", Toast.LENGTH_SHORT).show()
                    }
                }

            }

        }

        registrationButton.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
        passwordRecoveryButton.setOnClickListener{
            startActivity(Intent(this,PasswordRecoveryActivity::class.java))
        }
    }
}
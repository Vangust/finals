package com.example.fianls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class PasswordRecoveryActivity : AppCompatActivity() {
    private lateinit var passwordRecovery: EditText
    private lateinit var passwordRecoveryButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery)

        mAuth = FirebaseAuth.getInstance()

        passwordRecovery = findViewById(R.id.passwordRecoveryEditText)
        passwordRecoveryButton = findViewById(R.id.passwordRecoveryButton)

        passwordRecoveryButton.setOnClickListener {
            val email = passwordRecovery.text.toString()
            if(email.isEmpty()){
                Toast.makeText(this,"Please fill in your email adress",Toast.LENGTH_SHORT).show()
            }else{
                mAuth.sendPasswordResetEmail(email).addOnCompleteListener {
                    task ->
                    if(task.isSuccessful){
                        startActivity(Intent(this,MainActivity::class.java))
                        finish()
                    } else{
                        Toast.makeText(this,"Error has been encountered, please try again",Toast.LENGTH_SHORT).show()

                    }
                }
            }
        }
    }
}
package com.example.fianls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class RegistrationActivity : AppCompatActivity() {

    private lateinit var inputEmail:EditText
    private lateinit var inputPassword:EditText
    private lateinit var repeatPassword:EditText
    private lateinit var signUpButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        mAuth = FirebaseAuth.getInstance()

        inputEmail = findViewById(R.id.emailRegisterEditText)
        inputPassword = findViewById(R.id.passwordRegisterEditText)
        repeatPassword = findViewById(R.id.repeatPasswordEditText)
        signUpButton = findViewById(R.id.signUpButton)

        signUpButton.setOnClickListener {

            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()
            val repeat = repeatPassword.text.toString()

            if(email.isEmpty()|| password.isEmpty()||repeat.isEmpty()){
                Toast.makeText(this,"Email and password required",Toast.LENGTH_SHORT).show()
            } else{
                mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener{task ->
                        if(task.isSuccessful){
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        } else{
                            Toast.makeText(this,"An error was encounted during registration, please try again",Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }
}
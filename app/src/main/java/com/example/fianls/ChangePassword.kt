package com.example.fianls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ChangePassword : AppCompatActivity() {

    private lateinit var changePassword: EditText
    private lateinit var changePassword2: EditText
    private lateinit var confirmButton: Button

    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        mAuth = FirebaseAuth.getInstance()

        changePassword = findViewById(R.id.editTextChangePassword)
        changePassword2 = findViewById(R.id.editTextChangePassword2)
        confirmButton = findViewById(R.id.confirmPasswordChangeButton)

        confirmButton.setOnClickListener {
            val newPassword = changePassword.text.toString()
            val newPassword2 = changePassword2.text.toString()

            if(newPassword.isEmpty()||newPassword2.isEmpty()){
                Toast.makeText(this,"Password Required!",Toast.LENGTH_SHORT).show()
            }else{
                if (newPassword == newPassword2){
                    mAuth.currentUser?.updatePassword(newPassword)?.addOnCompleteListener {
                            task ->
                        if (task.isSuccessful){
                            startActivity(Intent(this,UserActivity::class.java))
                            finish()
                        } else{
                            Toast.makeText(this,"Error has been encountered, please try again",Toast.LENGTH_SHORT).show()
                        }
                    }
                } else{
                    Toast.makeText(this,"Passwords don't match!",Toast.LENGTH_SHORT).show()

                }
            }
        }


    }
}
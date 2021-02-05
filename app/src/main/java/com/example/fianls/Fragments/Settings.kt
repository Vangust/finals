package com.example.fianls.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fianls.ChangePassword
import com.example.fianls.MainActivity
import com.example.fianls.R
import com.google.firebase.auth.FirebaseAuth

class Settings:Fragment(R.layout.fragment_settings) {
    private lateinit var logOutButton: Button
    private lateinit var changePasswordButton: Button

    private lateinit var mAuth: FirebaseAuth


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mAuth = FirebaseAuth.getInstance()


        logOutButton = view.findViewById(R.id.logOutButton)
        changePasswordButton = view.findViewById(R.id.changePasswordButton)

        logOutButton.setOnClickListener {
            mAuth.signOut()
            val intent = Intent (getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(intent)


        }
        changePasswordButton.setOnClickListener {
            val intent = Intent (getActivity(), ChangePassword::class.java)
            getActivity()?.startActivity(intent)


        }
    }

}
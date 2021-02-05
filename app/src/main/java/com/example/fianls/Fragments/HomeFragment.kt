package com.example.fianls.Fragments

import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.fianls.R


class HomeFragment:Fragment(R.layout.fragment_home) {

    private lateinit var navController: NavController

    private lateinit var personName:EditText
    private lateinit var personWeight:EditText
    private lateinit var personHeight:EditText
    private lateinit var personAge:EditText
    private lateinit var sendButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        personName = view.findViewById(R.id.editTextPersonName)
        personWeight = view.findViewById(R.id.editTextWeight)
        personHeight = view.findViewById(R.id.editTextHeight)
        personAge = view.findViewById(R.id.editTextAge)

        sendButton = view.findViewById(R.id.sendButton)


        navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val name = personName.text.toString()
            val weight = personWeight.text.toString().toInt()
            val height = personHeight.text.toString().toInt()
            val age = personAge.text.toString().toInt()

            val action = HomeFragmentDirections.actionNavigationHomeToNavigationDashboard(name,weight,height,age)


            navController.navigate(action)




        }

    }
}
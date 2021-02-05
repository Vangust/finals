package com.example.fianls.Fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fianls.R



class Dashboard:Fragment(R.layout.fragment_dashboard) {

    private lateinit var textView: TextView
    private lateinit var textView2: TextView



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)
        textView2 = view.findViewById(R.id.textView2)

        val name = DashboardArgs.fromBundle(requireArguments()).Name
        val age = DashboardArgs.fromBundle(requireArguments()).Age
        val weight = DashboardArgs.fromBundle(requireArguments()).Weight
        val height = DashboardArgs.fromBundle(requireArguments()).Height

        when(height){
            157 -> textView.text="Dear $name, your ideal weight is between 51-64kg"
            158 -> textView.text="Dear $name, your ideal weight is between 51-64kg"
            159 -> textView.text="Dear $name, your ideal weight is between 51-64kg"
            160 -> textView.text="Dear $name, your ideal weight is between 52-65kg"
            161 -> textView.text="Dear $name, your ideal weight is between 52-65kg"
            162 -> textView.text="Dear $name, your ideal weight is between 53-66kg"
            163 -> textView.text="Dear $name, your ideal weight is between 53-66kg"
            164 -> textView.text="Dear $name, your ideal weight is between 53-66kg"
            165 -> textView.text="Dear $name, your ideal weight is between 54-67kg"
            166 -> textView.text="Dear $name, your ideal weight is between 54-67kg"
            167 -> textView.text="Dear $name, your ideal weight is between 55-69kg"
            168 -> textView.text="Dear $name, your ideal weight is between 55-69kg"
            169 -> textView.text="Dear $name, your ideal weight is between 55-69kg"
            170 -> textView.text="Dear $name, your ideal weight is between 56-71kg"
            171 -> textView.text="Dear $name, your ideal weight is between 56-71kg"
            172 -> textView.text="Dear $name, your ideal weight is between 56-71kg"
            173 -> textView.text="Dear $name, your ideal weight is between 56-71kg"
            174 -> textView.text="Dear $name, your ideal weight is between 56-71kg"
            175 -> textView.text="Dear $name, your ideal weight is between 59-74kg"
            176 -> textView.text="Dear $name, your ideal weight is between 59-74kg"
            177 -> textView.text="Dear $name, your ideal weight is between 60-75kg"
            178 -> textView.text="Dear $name, your ideal weight is between 60-75kg"
            179 -> textView.text="Dear $name, your ideal weight is between 60-75kg"
            180 -> textView.text="Dear $name, your ideal weight is between 62-77kg"
            181 -> textView.text="Dear $name, your ideal weight is between 62-77kg"
            182 -> textView.text="Dear $name, your ideal weight is between 67-84kg"
            183 -> textView.text="Dear $name, your ideal weight is between 67-84kg"
            184 -> textView.text="Dear $name, your ideal weight is between 67-84kg"
            185 -> textView.text="Dear $name, your ideal weight is between 69-86kg"
            186 -> textView.text="Dear $name, your ideal weight is between 69-86kg"
            187 -> textView.text="Dear $name, your ideal weight is between 69-86kg"
            188 -> textView.text="Dear $name, your ideal weight is between 71-88kg"
            189 -> textView.text="Dear $name, your ideal weight is between 71-88kg"
            190 -> textView.text="Dear $name, your ideal weight is between 73-90kg"
            191 -> textView.text="Dear $name, your ideal weight is between 73-90kg"
            192 -> textView.text="Dear $name, your ideal weight is between 73-90kg"
            193 -> textView.text="Dear $name, your ideal weight is between 75-93kg"
            194 -> textView.text="Dear $name, your ideal weight is between 75-93kg"
            195 -> textView.text="Dear $name, your ideal weight is between 75-93kg"
        }
        when(age){
            in 18..30 -> textView2.text ="and your ideal fat % is 11%-13%"
            in 31..39 ->textView2.text="and your ideal fat % is 12%-14%"
            in 40..49 ->textView2.text="and your ideal fat % is 14%-16%"
            in 50..59 ->textView2.text="and your ideal fat % is 15%-17%"
            in 60..100 ->textView2.text="and your ideal fat % is 16%-18%"



        }



    }




}
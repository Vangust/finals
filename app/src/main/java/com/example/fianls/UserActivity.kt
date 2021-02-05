package com.example.fianls


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class UserActivity : AppCompatActivity() {
//    private lateinit var logOutButton: Button
//    private lateinit var changePasswordButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val navView: BottomNavigationView = findViewById(R.id.nav_View)

        val navController = findNavController(R.id.nav_host_fragment)

        val appConfig = AppBarConfiguration(setOf(R.id.navigation_home, R.id.navigation_dashboard,R.id.navigation_settings))

        setupActionBarWithNavController(navController, appConfig)
        navView.setupWithNavController(navController)



//        logOutButton = findViewById(R.id.logOutButton)
//        changePasswordButton = findViewById(R.id.changePasswordButton)

    }
}


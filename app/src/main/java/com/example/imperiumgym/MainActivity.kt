package com.example.imperiumgym

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.imperiumgym.databinding.ActivityMainBinding
import com.example.imperiumgym.viewmodel.SharedViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: SharedViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigationView.setupWithNavController(navController)

        binding.bottomNavigationView.setOnItemSelectedListener {menuItem ->
         NavigationUI.onNavDestinationSelected(menuItem, navController)
           navController.popBackStack(menuItem.itemId, false)

           true
        }

        viewModel.bottomnavVisability.observe(this) {
            if(it) {
                // bottomnavbar sichtbar machen
                binding.bottomNavigationView.visibility = View.VISIBLE
            } else {
                // bottomnavbar unsichtbar machen
                binding.bottomNavigationView.visibility = View.GONE
            }
        }
    }
}
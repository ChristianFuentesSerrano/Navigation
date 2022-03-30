package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*
        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainNavHost) as NavHostFragment
        val navController = navHostFragment.navController
        navView.setupWithNavController(navController)
        */

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"An awesome video title\", \"channel\": \"ChannelName\", \"views\": \"6k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"8k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"10k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:25\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"150k views\", \"datePosted\": \"A month ago\", \"duration\": \"05:02\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"254k views\", \"datePosted\": \"2 years ago\", \"duration\": \"05:00\"}")
        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}
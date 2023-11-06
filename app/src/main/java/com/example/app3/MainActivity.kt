package com.example.app3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app3.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val homeFragment = HomeFragment()
    private val mypageFragment = MypageFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState==null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.mainFrameLayout.id, homeFragment)
                .addToBackStack(null)
                .commit()
        }

        val bottomMenu = binding.navigationView
        bottomMenu.background = null

        bottomMenu.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction().replace(R.id.mainFrameLayout, homeFragment).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.mypageFragment -> {
                    supportFragmentManager.beginTransaction().replace(R.id.mainFrameLayout, mypageFragment).commit()
                    return@setOnNavigationItemSelectedListener true
                }

            }
            return@setOnNavigationItemSelectedListener false
        }

    }
}
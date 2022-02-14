package com.digimaster.projectdia.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.digimaster.projectdia.R
import com.digimaster.projectdia.databinding.ActivityMenuBinding
import com.digimaster.projectdia.fragment.HomeFragment
import com.digimaster.projectdia.fragment.ProfileFragment

class MenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentt: Fragment = HomeFragment()
        val transactionn: FragmentTransaction = supportFragmentManager.beginTransaction()
        transactionn.replace(R.id.content, fragmentt).commit()
        binding.navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menuSatu -> {
                    val fragment: Fragment = HomeFragment()
                    val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.content, fragment).commit()
                    true
                }
                R.id.menuDua -> {
                    val fragment:Fragment = ProfileFragment()
                    val transaction:FragmentTransaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.content,fragment).commit()
                    true
                }
                else -> false
            }
        }
    }
}
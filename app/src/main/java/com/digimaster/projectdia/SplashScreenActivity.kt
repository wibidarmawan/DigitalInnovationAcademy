package com.digimaster.projectdia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.digimaster.projectdia.activity.MenuActivity
import com.digimaster.projectdia.databinding.ActivitySplashScreenBinding
import com.digimaster.projectdia.utils.PrefsKeys
import com.pixplicity.easyprefs.library.Prefs

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    lateinit var binding:ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler().postDelayed({
            val isLogin = Prefs.getBoolean(PrefsKeys.IS_LOGIN, false)
            if (isLogin) {
                val intent = Intent(this, MenuActivity::class.java)
                this.startActivity(intent)
            } else {
                val intent = Intent(this, LoginActivity::class.java)
                this.startActivity(intent)
            }
        },3000)
    }
}
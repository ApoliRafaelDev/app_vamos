package br.com.rafaelapolinario.ope_racks_it_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rafaelapolinario.ope_racks_it_mobile.LoginActivity
import br.com.rafaelapolinario.ope_racks_it_mobile.R
import java.lang.Exception

class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background = object : Thread() {
            override fun run(){
                try{
                    Thread.sleep(3000)

                    val intent = Intent(baseContext, LoginActivity::class.java)
                    startActivity(intent)
                }
                catch(e: Exception){
                    e.printStackTrace()
                }
            }
        }

        background.start()
    }
}
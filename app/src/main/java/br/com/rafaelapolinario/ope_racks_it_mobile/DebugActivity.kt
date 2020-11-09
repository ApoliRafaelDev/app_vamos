package br.com.rafaelapolinario.ope_racks_it_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.toolbar.*

open class DebugActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var genericLayoutMenu: DrawerLayout? = null
    var genericMenuLateral: NavigationView? = null

    protected fun configuraMenuLateral(){
        var toggle = ActionBarDrawerToggle(
            this,
            genericLayoutMenu,
            toolbar_view,
            R.string.nav_drawer_open,
            R.string.nav_drawer_close
        )
        genericLayoutMenu?.addDrawerListener(toggle)
        toggle.syncState()
        genericMenuLateral?.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_assistidos -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_cadastrar -> {
                Toast.makeText(this, "Menu Cadastrar", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_config -> {
                val intent = Intent(this, ConfigActivity::class.java)
                startActivity(intent)
            }
        }
        genericLayoutMenu?.closeDrawer(GravityCompat.START)
        return true
    }


    private val TAG = "OPE_RACKS_IT"
    private val className: String
        get() {
            val s = javaClass.name
            return s.substring(s.lastIndexOf("."))
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, className + ".onCreate() chamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, className + ".onStart() chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, className + ".onRestart() chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, className + ".onResume() chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, className + ".onPause() chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, className + ".onStop() chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, className + ".onDestroy() chamado")
    }


}
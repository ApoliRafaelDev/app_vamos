package br.com.rafaelapolinario.ope_racks_it_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_config.*
import kotlinx.android.synthetic.main.navigation_view.*
import kotlinx.android.synthetic.main.toolbar.*

class ConfigActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)
        setSupportActionBar(toolbar_view)
        supportActionBar?.title = "Config"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        this.genericLayoutMenu = layoutMenuLateral
        this.genericMenuLateral = menu_lateral

        configuraMenuLateral()
    }
}
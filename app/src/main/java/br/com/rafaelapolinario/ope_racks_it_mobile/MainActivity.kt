package br.com.rafaelapolinario.ope_racks_it_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation_view.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : DebugActivity() {

    private var assistidos = listOf<Assistido>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_view)
        supportActionBar?.title = "V.A.M.O.S"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        this.genericLayoutMenu = layoutMenuLateral
        this.genericMenuLateral = menu_lateral

        configuraMenuLateral()

        recyclerAssistidos?.layoutManager = LinearLayoutManager(this)
        recyclerAssistidos?.itemAnimator = DefaultItemAnimator()
        recyclerAssistidos?.setHasFixedSize(true)
    }

    override fun onResume(){
        super.onResume()
        taskAssistidos()
    }

    fun taskAssistidos(){
        this.assistidos = AssistidoService.getAssistido()
        recyclerAssistidos?.adapter = AssistidoAdapter(this.assistidos){onClickAssistidos(it)}
    }

    fun onClickAssistidos(assistido: Assistido){
        var it = Intent(this, AssistidoActivity::class.java)
        it.putExtra("assistido", assistido)
        startActivity(it)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemId = item.itemId
        if (itemId == R.id.action_buscar){
            Toast.makeText(this, "Botão Buscar", Toast.LENGTH_LONG).show()
        } else if (itemId == R.id.action_adicionar){
            Toast.makeText(this, "Botão Adicionar", Toast.LENGTH_LONG).show()
        } else if (itemId == R.id.action_atualizar){
            this.recreate();
        } else if (itemId == android.R.id.home){
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}
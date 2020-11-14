package br.com.rafaelapolinario.ope_racks_it_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class AssistidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assistido)

        var assistido = intent.getSerializableExtra("assistido")

        Toast.makeText(this, "$assistido", Toast.LENGTH_SHORT).show()
    }
}
package br.com.rafaelapolinario.ac_desmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.botao_login)
            button.setOnClickListener{
                val valorUsuario = input_username.text.toString()
                val valorSenha = input_senha.text.toString()

                if(valorUsuario == "aluno" && valorSenha == "impacta") {
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Usuário ou Senha inválidos", Toast.LENGTH_LONG).show()
                }
            }
    }
}
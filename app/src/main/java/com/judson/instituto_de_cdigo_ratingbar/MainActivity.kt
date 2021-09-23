package com.judson.instituto_de_cdigo_ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rgb.setOnRatingBarChangeListener { ratingBar, rating, fromUser -> rating
            txt_texto.text  = ""+rating
        }

        btn_executar.setOnClickListener {
            Toast.makeText(applicationContext, "Valo selecionado = "+rgb.rating, Toast.LENGTH_LONG).show()
        }
    }
}
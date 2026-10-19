
package com.serranusgym.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(18, 18, 18)
        window.navigationBarColor = Color.rgb(18, 18, 18)

        val fondo = LinearLayout(this)
        fondo.orientation = LinearLayout.VERTICAL
        fondo.gravity = Gravity.CENTER
        fondo.setPadding(32, 32, 32, 32)
        fondo.setBackgroundColor(Color.rgb(18, 18, 18))

        val nombre = TextView(this)
        nombre.text = "SERRANUSGYM"
        nombre.textSize = 32f
        nombre.setTextColor(Color.rgb(255, 153, 0))
        nombre.gravity = Gravity.CENTER

        val bienvenida = TextView(this)
        bienvenida.text = "TU ENTRENAMIENTO.\\nTU EVOLUCIÓN."
        bienvenida.textSize = 22f
        bienvenida.setTextColor(Color.WHITE)
        bienvenida.gravity = Gravity.CENTER
        bienvenida.setPadding(0, 32, 0, 32)

        val descripcion = TextView(this)
        descripcion.text =
            "Entrena a tu nivel. Supera tus límites."
        descripcion.textSize = 16f
        descripcion.setTextColor(Color.LTGRAY)
        descripcion.gravity = Gravity.CENTER

        val boton = Button(this)
        boton.text = "COMENZAR A ENTRENAR"
        boton.setOnClickListener {
            bienvenida.text =
                "¡VAMOS A ENTRENAR!\\nTu evolución empieza hoy."
        }

        fondo.addView(nombre)
        fondo.addView(bienvenida)
        fondo.addView(descripcion)

        val espacio = android.view.View(this)
        fondo.addView(
            espacio,
            LinearLayout.LayoutParams(1, 32)
        )

        fondo.addView(
            boton,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        setContentView(fondo)
    }
}

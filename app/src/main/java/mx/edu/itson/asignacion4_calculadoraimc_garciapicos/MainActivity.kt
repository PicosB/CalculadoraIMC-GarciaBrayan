package mx.edu.itson.asignacion4_calculadoraimc_garciapicos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    //variables


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etWeight: EditText= findViewById(R.id.etWeight)
        val etHeight: EditText= findViewById(R.id.etHeight)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val tvimc: TextView = findViewById(R.id.imc)
        val tvrange: TextView = findViewById(R.id.range)

        btnCalcular.setOnClickListener {

            val weightStr = etWeight.text.toString()
            val heightStr = etHeight.text.toString()

            val weight = weightStr.toFloat()
            val height = heightStr.toFloat()

            val imc = calcularIMC(weight, height)
            tvimc.text() = "IMC: %.2f".format(imc)

        }


    }

    fun calcularIMC(peso: Float, altura:Float): Float{
        return peso / (altura * altura)
    }



}
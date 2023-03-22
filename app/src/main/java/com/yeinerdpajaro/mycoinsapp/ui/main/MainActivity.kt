package com.yeinerdpajaro.mycoinsapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yeinerdpajaro.mycoinsapp.R
import com.yeinerdpajaro.mycoinsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    private var valor: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        mainBinding.dolarPesoButton.setOnClickListener {
            if(mainBinding.valorInputEditText.text.toString()=="."){
                mainBinding.valorInputEditText.error = "Total: Ingresa un valor númerico."
            }else if(mainBinding.valorInputEditText.text.toString()=="") {
                mainBinding.valorInputEditText.error = "Total: El campo está vacío."
            }else{
                valor = dolar2peso(mainBinding.valorInputEditText.text.toString().toDouble())
                mainBinding.totalTextView.text = "${getString(R.string.total) + " "+  valor}"
            }


        }
        mainBinding.dolarEuroButton.setOnClickListener {
            if(mainBinding.valorInputEditText.text.toString()=="."){
                mainBinding.valorInputEditText.error = "Total: Ingresa un valor númerico."
            }else if(mainBinding.valorInputEditText.text.toString()=="") {
                mainBinding.valorInputEditText.error = "Total: El campo está vacío."
            }else{
                valor = dolar2euro(mainBinding.valorInputEditText.text.toString().toDouble())
                mainBinding.totalTextView.text = "${getString(R.string.total) + " "+  valor}"
            }

        }
        mainBinding.pesoDolarButton.setOnClickListener {
            if(mainBinding.valorInputEditText.text.toString()=="."){
                mainBinding.valorInputEditText.error = "Total: Ingresa un valor númerico."
            }else if(mainBinding.valorInputEditText.text.toString()=="") {
                mainBinding.valorInputEditText.error = "Total: El campo está vacío."
            }else{
                valor = peso2dolar(mainBinding.valorInputEditText.text.toString().toDouble())
                mainBinding.totalTextView.text = "${getString(R.string.total) + " "+  valor}"
            }

        }
        mainBinding.pesoEuroButton.setOnClickListener{
            if(mainBinding.valorInputEditText.text.toString()=="."){
                mainBinding.valorInputEditText.error = "Total: Ingresa un valor númerico."
            }else if(mainBinding.valorInputEditText.text.toString()=="") {
                mainBinding.valorInputEditText.error = "Total: El campo está vacío."
            }else{
                valor = peso2euro(mainBinding.valorInputEditText.text.toString().toDouble())
                mainBinding.totalTextView.text = "${getString(R.string.total) + " "+  valor}"
            }

        }
        mainBinding.euroDolarButton.setOnClickListener {
            if(mainBinding.valorInputEditText.text.toString()=="."){
                mainBinding.valorInputEditText.error = "Total: Ingresa un valor númerico."
            }else if(mainBinding.valorInputEditText.text.toString()=="") {
                mainBinding.valorInputEditText.error = "Total: El campo está vacío."
            }else{
                valor = euro2dolar(mainBinding.valorInputEditText.text.toString().toDouble())
                mainBinding.totalTextView.text = "${getString(R.string.total) + " "+  valor}"
            }

        }
        mainBinding.euroPesoButton.setOnClickListener {
            if(mainBinding.valorInputEditText.text.toString()=="."){
                mainBinding.valorInputEditText.error = "Total: Ingresa un valor númerico."
            }else if(mainBinding.valorInputEditText.text.toString()=="") {
                mainBinding.valorInputEditText.error = "Total: El campo está vacío."
            }else{
                valor = eurotopeso(mainBinding.valorInputEditText.text.toString().toDouble())
                mainBinding.totalTextView.text = "${getString(R.string.total) + " "+  valor}"
            }


        }


        val view = mainBinding.root
        setContentView(view)
    }

    private fun dolar2peso(valor: Double): Double {

        var total = valor*4850.50
        return total
    }
    private fun dolar2euro(valor: Double): Double {

        var total = valor*0.93
        return total
    }
    private fun peso2dolar(valor: Double): Double {

        var total = valor*0.00021
        return total
    }
    private fun peso2euro(valor: Double): Double {

        var total = valor*0.00020
        return total
    }
    private fun euro2dolar(valor: Double): Double {

        var total = valor*1.08
        return total
    }
    private fun eurotopeso(valor: Double): Double {

        var total = valor*5229.08
        return total
    }
}
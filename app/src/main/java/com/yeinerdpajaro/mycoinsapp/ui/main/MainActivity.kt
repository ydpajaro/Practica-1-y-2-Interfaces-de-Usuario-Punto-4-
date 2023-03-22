package com.yeinerdpajaro.mycoinsapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.yeinerdpajaro.mycoinsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel:MainViewModel

    private var valor: Double = 0.0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]



        val mensajeObserver = Observer<String>{mensaje ->
            mainBinding.totalTextView.text=mensaje
        }

        mainViewModel.mensaje.observe(this, mensajeObserver)



        mainBinding.dolarPesoButton.setOnClickListener {
            mainViewModel.novaciodolar(mainBinding.valorInputEditText.text.toString())
        }

        mainBinding.dolarEuroButton.setOnClickListener {
            mainViewModel.novaciodolar2euro(mainBinding.valorInputEditText.text.toString())

        }

        mainBinding.pesoDolarButton.setOnClickListener {
            mainViewModel.novaciopeso2dolar(mainBinding.valorInputEditText.text.toString())

        }

        mainBinding.pesoEuroButton.setOnClickListener{
            mainViewModel.novaciopeso2euro(mainBinding.valorInputEditText.text.toString())
        }

        mainBinding.euroDolarButton.setOnClickListener {
            mainViewModel.novacioeuro2dolar(mainBinding.valorInputEditText.text.toString())
        }

        mainBinding.euroPesoButton.setOnClickListener {
            mainViewModel.novacioeuro2peso(mainBinding.valorInputEditText.text.toString())
        }


        val view = mainBinding.root
        setContentView(view)
    }
}
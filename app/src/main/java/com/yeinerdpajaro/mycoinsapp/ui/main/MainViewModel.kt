package com.yeinerdpajaro.mycoinsapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val mensaje: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }


    fun novaciodolar(input: String) {

        if (input == "") {
            mensaje.value = "El campo debe contener un valor."
        }else if (input == "."){
            mensaje.value = "El campo debe ser un número."
        }    else {
            var total = input.toDouble() * 4850.50
            mensaje.value = "total: ${total.toString()}"
        }
    }

    fun novaciodolar2euro(input: String) {

        if (input == "") {
            mensaje.value = "El campo debe contener un valor."
        }else if (input == "."){
            mensaje.value = "El campo debe ser un número."
        }    else {
            var total = input.toDouble() *0.93
            mensaje.value = "total: ${total.toString()}"
        }
    }

    fun novaciopeso2dolar(input: String) {

        if (input == "") {
            mensaje.value = "El campo debe contener un valor."
        }else if (input == "."){
            mensaje.value = "El campo debe ser un número."
        }    else {
            var total = input.toDouble() * 0.00021
            mensaje.value = "total: ${total.toString()}"
        }
    }

    fun novaciopeso2euro(input: String) {

        if (input == "") {
            mensaje.value = "El campo debe contener un valor."
        }else if (input == "."){
            mensaje.value = "El campo debe ser un número."
        }     else {
            var total = input.toDouble() *0.00020
            mensaje.value = "total: ${total.toString()}"
        }
    }

    fun novacioeuro2dolar(input: String) {

        if (input == "") {
            mensaje.value = "El campo debe contener un valor."
        }else if (input == "."){
            mensaje.value = "El campo debe ser un número."
        }
        else {
            var total = input.toDouble() * 1.08
            mensaje.value = "total: ${total.toString()}"
        }
    }

    fun novacioeuro2peso(input: String) {

        if (input == "") {
            mensaje.value = "El campo debe contener un valor."
        }else if (input == "."){
            mensaje.value = "El campo debe ser un número."
        }else {
            var total = input.toDouble() *5229.08
            mensaje.value = "total: ${total.toString()}"
        }
    }
}
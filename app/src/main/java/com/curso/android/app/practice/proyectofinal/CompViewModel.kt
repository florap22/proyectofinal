package com.curso.android.app.practice.proyectofinal

import androidx.lifecycle.ViewModel

class CompViewModel : ViewModel(){
    fun compNum(num1:Int,num2:Int):String{
        return if (num1>num2){
            "El Num del casillero 1 es mayor"
        }else if(num1<num2){
            "El Num del casillero 2 es mayor"
        }else{
            "Los Numeros son iguales"
        }
    }
}
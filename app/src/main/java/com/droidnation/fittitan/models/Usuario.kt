package com.droidnation.fittitan.models

data class Usuario(
    val id:Int,
    val username:String,
    val nombreCompleto:String,
    val email:String,
    val edad:Int,
    val genero:String,
    val imc:Int,
    val tipoImc:String,
    val rank:Int,
    val caloriasConsumidas:Int,
    val ejerciciosCompletados:Int,
    val imagen:String
)

package com.example.appaula.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

/*criação da entidade com os atributos*/
@Entity
data class Pessoa(
    val nome: String,
    val telefone: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)

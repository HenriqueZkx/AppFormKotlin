package com.example.appaula.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

/*construção do banco de dados*/
@Database(
    entities = [Pessoa::class],
    version = 1
)

abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao
}

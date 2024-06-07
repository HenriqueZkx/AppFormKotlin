package com.example.appaula.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

/*interação com o banco de dados*/
@Dao
interface PessoaDao {

    @Upsert
    suspend fun  upsertPessoa(pessoa: Pessoa)

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)

    @Query("SELECT * FROM pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>
}

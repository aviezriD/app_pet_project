package com.mx.mascotas.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CatStore(@PrimaryKey var id : Int, var name : String) {
}
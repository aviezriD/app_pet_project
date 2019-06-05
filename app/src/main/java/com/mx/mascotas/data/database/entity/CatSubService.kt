package com.mx.mascotas.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CatSubService (@PrimaryKey var id : Int, var idService: Int, var name: String) {
    override fun toString(): String
    {
        return name
    }
}

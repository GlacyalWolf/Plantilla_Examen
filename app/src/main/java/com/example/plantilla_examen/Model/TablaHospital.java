package com.example.plantilla_examen.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TablaHospital {
    @PrimaryKey
    public int hospitalID;

    @ColumnInfo(name="NombreHospital")
    public String hName;
}

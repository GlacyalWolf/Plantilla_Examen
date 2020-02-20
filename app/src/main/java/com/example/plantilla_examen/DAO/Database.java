package com.example.plantilla_examen.DAO;

import androidx.room.RoomDatabase;

import com.example.plantilla_examen.Model.TablaHospital;

@androidx.room.Database(entities = {TablaHospital.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract TablaHospital tablaHospital();

}

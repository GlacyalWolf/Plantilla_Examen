package com.example.plantilla_examen.DAO;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.plantilla_examen.Model.TablaHospital;

import java.util.ArrayList;

@Dao
public interface Querys {
    @Query("SELECT * FROM TablaHospital")
    ArrayList<TablaHospital> getAll();
}

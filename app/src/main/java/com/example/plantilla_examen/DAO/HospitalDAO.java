package com.example.plantilla_examen.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.plantilla_examen.Model.TablaHospital;

import java.util.ArrayList;

@Dao
public interface HospitalDAO {
    @Query("SELECT * FROM hospital")
    ArrayList<TablaHospital> getAll();

    @Insert
    void addHospital(TablaHospital hospital);

}

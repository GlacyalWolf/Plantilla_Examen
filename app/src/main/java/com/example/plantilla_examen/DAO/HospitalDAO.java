package com.example.plantilla_examen.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.plantilla_examen.Model.DHospital;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface HospitalDAO {
    @Query("SELECT * FROM hospital")
    List<DHospital> getAll();

    @Insert
    void addHospital(DHospital hospital);

}

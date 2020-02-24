package com.example.plantilla_examen.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "hospital")
public class DHospital {
    @PrimaryKey
    public int hospitalID;

    @ColumnInfo(name="NombreHospital")
    public String hName;

    public DHospital(int hospitalID, String hName) {
        this.hospitalID = hospitalID;
        this.hName = hName;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public String gethName() {
        return hName;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }
}

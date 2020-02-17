package com.example.plantilla_examen.Model;

public class Hospital {
    int id;
    String hospitalName;

    public Hospital(int id, String hospitalName) {
        this.id = id;
        this.hospitalName = hospitalName;
    }

    public int getId() {
        return id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}

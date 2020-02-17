package com.example.plantilla_examen.Model;

public class Paciente {
    int idHospital;
    int idPacient;
    String pacientName;

    public Paciente(int idHospital, int idPacient, String pacientName) {
        this.idHospital = idHospital;
        this.idPacient = idPacient;
        this.pacientName = pacientName;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public String getPacientName() {
        return pacientName;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public void setPacientName(String pacientName) {
        this.pacientName = pacientName;
    }
}

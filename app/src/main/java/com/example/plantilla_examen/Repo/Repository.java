package com.example.plantilla_examen.Repo;

import android.content.Context;

import com.example.plantilla_examen.DAO.Connection;
import com.example.plantilla_examen.DAO.HospitalDAO;
import com.example.plantilla_examen.Model.DHospital;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository repo;
    private static Connection con;

    private Repository(Context c){
        con = Connection.getConnection(c);
    }
    public static Repository gerRepo(Context c){
        if (repo == null){
            repo = new Repository(c);
        }
        return repo;
    }

    public static List<DHospital> getHospitales (Context c){
        DHospital h1= new DHospital(1,"sant petesburgo");
        DHospital h2= new DHospital(2,"pitogoldo");
        Connection con = Connection.getConnection(c);
        List<DHospital> hospitallist= con.HospitalDAO().getAll();
        con.destroyConnection();
        con.close();
        return hospitallist;


    }


}

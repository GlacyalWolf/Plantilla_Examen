package com.example.plantilla_examen.Repo;

import android.content.Context;
import android.util.Log;

import com.example.plantilla_examen.DAO.Connection;
import com.example.plantilla_examen.DAO.HospitalDAO;
import com.example.plantilla_examen.Model.DHospital;

import java.sql.Array;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository repo;

    //ROOM
    private static Connection con;

    //Postgres
    private static String driverLocation = "org.postgresql.Driver";
    private static String postgresConnection = "jdbc:postgresql://192.168.0.22:5432/";
    private static String postgresUsername = "hedy";
    private static String postgresPassword = "lamarr";

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

    private static java.sql.Connection connection = null;

    public static java.sql.Connection openPostgresConnection(){
        try {
            Class.forName(driverLocation);

            connection = DriverManager.getConnection(postgresConnection,postgresUsername,
                    postgresPassword);

            if (connection != null){
                Log.d("PostgreSQL","Connected to the postgres server successfully");
            } else {
                Log.d("PostgreSQL","Failed to connect");
            }

        } catch (SQLException e) {
            Log.d("PostgreSQL","Error connecting to PostgreSQL server");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }


}

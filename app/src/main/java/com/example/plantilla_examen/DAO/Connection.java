package com.example.plantilla_examen.DAO;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.plantilla_examen.Model.DHospital;

@Database(entities = {DHospital.class}, version = 1,exportSchema = false)
public abstract class Connection extends RoomDatabase {

    private static Connection INSTANCE;

    public abstract HospitalDAO HospitalDAO();

    public static Connection getConnection(Context c){
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(c, Connection.class, "h.db").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
    public static void destroyConnection(){
        INSTANCE = null;
    }

}




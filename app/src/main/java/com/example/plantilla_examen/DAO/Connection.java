package com.example.plantilla_examen.DAO;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.plantilla_examen.Model.TablaHospital;

@Database(entities = {TablaHospital.class}, version = 1)
public abstract class Connection extends RoomDatabase {

    private static Connection INSTANCE;

    public abstract TablaHospital tablaHospital();

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




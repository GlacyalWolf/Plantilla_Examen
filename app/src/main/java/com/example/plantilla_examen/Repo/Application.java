package com.example.plantilla_examen.Repo;

import com.example.plantilla_examen.DAO.Connection;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Repository.gerRepo(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Connection.destroyConnection();
    }
}

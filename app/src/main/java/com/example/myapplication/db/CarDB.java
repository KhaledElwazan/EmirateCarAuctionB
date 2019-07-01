package com.example.myapplication.db;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapplication.retrofit_api_response.Car;


@Database(entities = {Car.class}, version = 1)
public abstract class CarDB extends RoomDatabase {


    private static CarDB carDB;

    public static CarDB getInstance(Context context) {
        if (null == carDB) {
            carDB = buildDatabaseInstance(context);
        }
        return carDB;
    }

    private static CarDB buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                CarDB.class,
                Constants.DB_NAME)
                .allowMainThreadQueries().build();
    }

    public abstract CarDAO getCarDBDao();

    public void cleanUp() {
        carDB = null;
    }


}

package com.example.myapplication.db;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myapplication.retrofit_api_response.Car;

import java.util.List;

@Dao
public interface CarDAO {


    @Query("SELECT * FROM " + Constants.DB_TABLE)
    List<Car> getAll();


    @Insert
    void insert(Car car);

    @Delete
    void delete(Car car);

    @Query("SELECT * FROM " + Constants.DB_TABLE + " WHERE carID = :id")
    Car getCar(Integer id);

}
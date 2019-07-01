package com.example.myapplication.retrofit_api_response;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class DataConverter {

    private static Gson gson = new Gson();

    @TypeConverter
    public AuctionInfo string2AuctionInfo(String value) {


        if (value == null) {
            return new AuctionInfo();
        }

        Type listType = new TypeToken<AuctionInfo>() {
        }.getType();

        return gson.fromJson(value, listType);
    }

    @TypeConverter
    public String auctionInfo2String(AuctionInfo info) {


        return gson.toJson(info);
    }

}

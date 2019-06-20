package com.example.myapplication.retrofit_api_response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {


    @GET("carsonline")
    Call<Cars> getCars();

}

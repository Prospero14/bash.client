package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retro {
    @GET("/api/get")
   Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
}

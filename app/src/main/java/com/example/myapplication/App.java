package com.example.myapplication;

import android.app.Application;

import java.io.IOException;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private static Retro retro;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://umorili.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retro = retrofit.create(Retro.class);
    }

    public static Retro getApi() {
        return retro;
    }
}

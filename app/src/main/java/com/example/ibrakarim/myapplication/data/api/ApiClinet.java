package com.example.ibrakarim.myapplication.data.api;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ibrakarim.myapplication.data.Contract.BASE_URL;

public class ApiClinet {

    private static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit == null){
            Log.d("fromApiClient","getApiClient");
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}

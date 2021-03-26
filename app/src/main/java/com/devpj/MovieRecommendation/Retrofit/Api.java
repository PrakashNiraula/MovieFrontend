package com.devpj.MovieRecommendation.Retrofit;

import retrofit.RestAdapter;

/**
 * Created by AbhiAndroid
 */
public class Api {

    public static ApiInterface getClient() {

        // change your base URL
//        RestAdapter adapter = new RestAdapter.Builder()
//                .setEndpoint("http://www.abhidemo.com/demo/food") //Set the Root URL
//                .build(); //Finally building the adapter

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("https://www.khajakhane.com/food") //Set the Root URL
                .build(); //Finally building the adapter


        //Creating object for our interface
        ApiInterface api = adapter.create(ApiInterface.class);
        return api;
    }
}

package com.example.stud.musicapp.Api;

/**
 * Created by W57004 on 2018-04-19.
 */

public class Apiservis {
    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://www.theaudiodb.com/api/v1/json/{APIKEY}/" )
                .build();
        return retrofit.create(ApiClient.class );
    }
}

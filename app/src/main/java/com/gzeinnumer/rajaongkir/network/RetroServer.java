package com.gzeinnumer.rajaongkir.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//todo 3
public class RetroServer {
    //https://pro.rajaongkir.com/api/city?key=428ff8d9782be1b3721ec552cbf56827

    private static final String BASE_URL = "https://pro.rajaongkir.com/api/";

    private static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance(){
        return setInit().create(ApiService.class);
    }
}
//todo 4 test di posmant/browser
//https://pro.rajaongkir.com/api/city?key=428ff8d9782be1b3721ec552cbf56827
//generate hasil dengan pojo >> cek todo5

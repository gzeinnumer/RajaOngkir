package com.gzeinnumer.rajaongkir.network;

import com.gzeinnumer.rajaongkir.model.ResponseCity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//todo 10 panggil api
public interface ApiService {
    @GET("city?key=428ff8d9782be1b3721ec552cbf56827")
    Call<ResponseCity> getCity();
}

package com.example.android.sunshine.app.API;

import com.example.android.sunshine.app.model.Weathermodel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by abasurto on 12/04/2016.
 */
public interface WeatherAPI {

    //string user is for passing values from edittext for eg: user=basil2style,google
    //response is the response from the server which is now in the POJO
        @GET("forecast/daily")
        Call<Weathermodel> getWeatherForecast(
                @Query("q") String zipCode,
                @Query("mode") String mode,
                @Query("units") String units,
                @Query("cnt") int number_of_days,
                @Query("APPID") String appid
        );
}

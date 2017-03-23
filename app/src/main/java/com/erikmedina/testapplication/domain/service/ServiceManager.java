package com.erikmedina.testapplication.domain.service;

import com.erikmedina.testapplication.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by erik on 18/03/17.
 */

public class ServiceManager {

  public static WebService createWebService() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BuildConfig.API_ENDPOINT)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit.create(WebService.class);
  }

}

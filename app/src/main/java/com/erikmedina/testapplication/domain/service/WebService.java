package com.erikmedina.testapplication.domain.service;

import com.erikmedina.testapplication.model.ResultInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by erik on 18/03/17.
 */

public interface WebService {

  @Headers("Accept:application/json")
  @GET(".")
  Call<ResultInfo> getResultInfo(@Query("page") int page,
      @Query("results") int results);

}

package com.majedul.surveyapp.Api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface BaseApiService {

    @GET("v1/whoami")
    Call<ResponseBody> getDriverDetails(
            @Header("Authorization") String token
    );

}

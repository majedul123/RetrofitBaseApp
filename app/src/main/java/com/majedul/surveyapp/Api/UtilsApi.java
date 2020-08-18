package com.majedul.surveyapp.Api;

import com.majedul.surveyapp.BuildConfig;

public class UtilsApi {

    public static final String BASE_URL_API = "";
    //public final static String BASE_URL_API = BuildConfig.BUILD_TYPE;
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}

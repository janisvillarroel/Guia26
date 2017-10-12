package com.ejemplo.guia26;

/**
 * Created by Janis on 12/10/2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EndPointApi {
    //?jscmd=data&format=json&bibkeys=ISBN:
    @GET(ConstantsRestApi.URL_BOOK)
    Call<BookResponse> getList(@Query("jscmd") String jscmd, @Query("format") String format, @Query("bibkeys") String bibkeys);

}
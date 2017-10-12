package com.ejemplo.guia26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {

    /**
     * Get connexion rest api generic with param gson converter target objet
     *
     * @param gson
     * @return EndPointApi
     */
    public EndPointApi connexionApi(Gson gson) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantsRestApi.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndPointApi.class);
    }

    public Gson buildGsonDeserializedBook(String isbn) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BookResponse.class, new BookDeserialized(isbn));
        return gsonBuilder.create();
    }

}

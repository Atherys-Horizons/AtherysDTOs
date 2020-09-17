package com.atherys.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AtherysGsonBuilder {

    public static Gson getGson() {
        return new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
    }

}

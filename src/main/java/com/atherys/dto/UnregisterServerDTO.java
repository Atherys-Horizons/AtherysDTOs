package com.atherys.dto;

import com.google.gson.annotations.Expose;

public class UnregisterServerDTO {

    public static final String KEY = "US";

    @Expose
    private String key;

    public UnregisterServerDTO() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

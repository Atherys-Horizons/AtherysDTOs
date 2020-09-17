package com.atherys.dto;

import com.google.gson.annotations.Expose;

public class RegisterServerDTO {

    @Expose
    private String key;

    @Expose
    private String name;

    @Expose
    private String motd;

    @Expose
    private String ipAddress;

    @Expose
    private int port;

    public RegisterServerDTO() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

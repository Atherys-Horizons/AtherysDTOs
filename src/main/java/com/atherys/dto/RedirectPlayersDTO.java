package com.atherys.dto;

import com.google.gson.annotations.Expose;

import java.util.List;
import java.util.UUID;

public class RedirectPlayersDTO {

    @Expose
    private String destination;

    @Expose
    private List<UUID> players;

    public RedirectPlayersDTO() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<UUID> getPlayers() {
        return players;
    }

    public void setPlayers(List<UUID> players) {
        this.players = players;
    }
}

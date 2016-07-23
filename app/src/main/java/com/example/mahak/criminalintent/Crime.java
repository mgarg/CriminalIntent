package com.example.mahak.criminalintent;

import java.util.UUID;

/**
 * Created by mahak on 23/7/16.
 */
public class Crime {
    private UUID crimeId;
    private String crimeTitle;

    public Crime(){
        crimeId = UUID.randomUUID();
    }

    public UUID getCrimeId() {
        return crimeId;
    }

    public String getCrimeTitle() {
        return crimeTitle;
    }

    public void setCrimeTitle(String crimeTitle) {
        this.crimeTitle = crimeTitle;
    }
}

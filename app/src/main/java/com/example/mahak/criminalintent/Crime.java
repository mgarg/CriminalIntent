package com.example.mahak.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by mahak on 23/7/16.
 */
public class Crime {
    private UUID crimeId;
    private String crimeTitle;
    private Date date;
    private boolean status;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Crime(){
        crimeId = UUID.randomUUID();
        date = new Date();

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

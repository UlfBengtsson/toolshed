package org.example.models;

import org.example.models.Tool;

public class Phone extends Tool {

    private boolean powerOn;
    private boolean inUse;

    @Override
    public String use() {
        if (powerOn == false) {
            return "its silent, no power!";
        }
        if (inUse) {
            return "it is in use by someone else.";
        }
        return "You hear the dial tone.";
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}

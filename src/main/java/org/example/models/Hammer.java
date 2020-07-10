package org.example.models;

import org.example.models.Tool;

public class Hammer extends Tool {

    private double kilograms;

    @Override
    public String use() {
        return "Big hit with the force of " + kilograms + "kg";
    }

    public double getKilograms() {
        return kilograms;
    }

    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }
}

package org.example.models;

public abstract class Tool {
    private String name;

    public abstract String use();

    //Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

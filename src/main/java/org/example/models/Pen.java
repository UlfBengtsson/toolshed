package org.example.models;

import org.example.models.Tool;

public class Pen extends Tool {
    @Override
    public String use() {
        return "writes text";
    }
}

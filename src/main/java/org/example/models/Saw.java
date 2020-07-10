package org.example.models;

import org.example.models.Tool;

public class Saw extends Tool {

    private int handsNeededToUse;

    @Override
    public String use() {
        return "saw materials";
    }

    public int getHandsNeededToUse() {
        return handsNeededToUse;
    }

    public void setHandsNeededToUse(int handsNeededToUse) {
        this.handsNeededToUse = handsNeededToUse;
    }
}

package org.example.models;

import java.util.Arrays;

public class ToolBag extends Bag {

    private Tool[] tools = new Tool[0];

    @Override
    public String use() {

        StringBuilder sb = new StringBuilder();
        sb.append("Tool bag contains the following tools:\n");
        if (tools.length == 0) {
            sb.append("No tools in the toolbag at this moment");
        }
        else {
            for (int i = 0; i < tools.length ; i++) {
                sb.append((i + 1) + ": " + tools[i].getName() + "\n");
            }
        }

        return sb.toString();
    }

    public int amountOfToolsInBag() {
        return tools.length;
    }

    public void addToBag(Tool tool) {
        tools = Arrays.copyOf(tools, tools.length + 1);
        tools[tools.length -1] = tool;
    }

}

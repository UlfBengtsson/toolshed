package org.example;

import org.example.models.*;

public class App
{
    public static void main( String[] args )
    {
        Pen pen = new Pen();
        Phone phone = new Phone();
        Hammer hammer = new Hammer();
        Saw saw = new Saw();
        Laptop laptop = new Laptop();
        Bag bag = new Bag();

        Tool[] studentsTools = new Tool[] {pen, phone, hammer, saw, laptop, bag};

        for (int i = 0; i < studentsTools.length ; i++) {
            System.out.println(studentsTools[i].use());
        }

        pen.setName("lead pen");
        hammer.setName("sledge hammer");
        hammer.setKilograms(12);

        ToolBag toolBag = new ToolBag();
        toolBag.addToBag(hammer);
        toolBag.addToBag(pen);

        System.out.println(toolBag.amountOfToolsInBag());
        System.out.println(toolBag.use());

    }
}

package com.swp;

import java.util.ArrayList;
import java.util.List;

public class GroupGraphicsObject implements GraphicsObject {

    private String name = "UnnamedGroup";
    private double size = 1;
    private String color = "\u001B[37m";
    private List<GraphicsObject> objects = new ArrayList<>();

    public GroupGraphicsObject() {
        this.name = name;
    }

    public GroupGraphicsObject(String name) {
        this.name = name;
    }

    @Override
    public void add(GraphicsObject object) {
        objects.add(object);
    }

    @Override
    public void delete(GraphicsObject object) {
        objects.remove(object);
    }

    @Override
    public void draw() {
        System.out.println(color + "I am a " + name + " with size " + size + Utils.ANSI_RESET);
        for (GraphicsObject o : objects
                ) {
            o.draw();
        }
    }

    @Override
    public void scale(double factor) {
        size *= factor;
        for (GraphicsObject o : objects
                ) {
            o.scale(factor);
        }
    }

    @Override
    public void setColor(String c) {
        if (c != null && !c.isEmpty()) {
            this.color = Utils.colorNameToAnsi(c);
            for (GraphicsObject o : objects
                    ) {
                o.setColor(c);
            }
        }
    }

}

package com.swp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class SingleGraphicsObject implements GraphicsObject {

    protected String name = "unnamed";
    protected double size = 1;
    protected String color = "\u001B[37m";

    @Override
    public void add(GraphicsObject object) {
        throw new NotImplementedException();
    }

    @Override
    public void delete(GraphicsObject object) {
        throw new NotImplementedException();
    }

    @Override
    public void scale(double factor) {
        size *= factor;
    }

    @Override
    public void setColor(String c) {
        if(c != null && !c.isEmpty()){
            color = Utils.colorNameToAnsi(c);
        }
    }

    protected void drawWithName(String name){
        System.out.println(color + "I am " + name + ", a " + name + " with size " + size + Utils.ANSI_RESET);
    }

}

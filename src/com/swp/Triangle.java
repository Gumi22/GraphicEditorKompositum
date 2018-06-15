package com.swp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Triangle extends SingleGraphicsObject{

    public Triangle(){
        setColor("yellow");
    }

    @Override
    public void draw() {
        drawWithName("Triangle");
    }
}

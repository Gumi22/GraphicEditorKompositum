package com.swp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Rectangle extends SingleGraphicsObject{

    public Rectangle(){
        setColor("blue");
    }

    @Override
    public void draw() {
        drawWithName("Rectangle");
    }
}

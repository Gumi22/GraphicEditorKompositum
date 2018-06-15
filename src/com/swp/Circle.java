package com.swp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Circle extends SingleGraphicsObject {

    public Circle(){
        setColor("red");
    }

    @Override
    public void draw() {
        drawWithName("Circle");
    }
}

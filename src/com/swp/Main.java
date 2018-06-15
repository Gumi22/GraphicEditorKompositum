package com.swp;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GraphicsObject t1 = new Triangle();
        GraphicsObject c1 = new Circle();
        GraphicsObject r1 = new Rectangle();

        List<GraphicsObject> list = new ArrayList<>();

        GraphicsObject g1 = new GroupGraphicsObject("GreenGroup");
        GraphicsObject t2 = new Triangle();
        GraphicsObject c2 = new Circle();
        GraphicsObject r2 = new Rectangle();

        try{
            g1.add(t2);
            g1.add(c2);
            g1.add(r2);
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }

        g1.setColor("g");
        g1.scale(2.0);
        r2.scale(1.5);
        g1.scale(0.5);


        list.add(t1);
        list.add(c1);
        list.add(r1);
        list.add(g1);


        for (GraphicsObject g: list) {
            g.draw();
        }
    }
}

package com.swp;

import javax.naming.OperationNotSupportedException;

public interface GraphicsObject {

    void add(GraphicsObject object) throws OperationNotSupportedException;

    void delete(GraphicsObject object) throws OperationNotSupportedException;

    void draw();

    void scale(double factor);

    void setColor(String color);

}

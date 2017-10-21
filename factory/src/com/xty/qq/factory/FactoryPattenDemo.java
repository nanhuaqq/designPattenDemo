package com.xty.qq.factory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class FactoryPattenDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        Shape rectangle = shapeFactory.createShape("rectangle");
        Shape ellipse = shapeFactory.createShape("ellipse");

        circle.draw();
        rectangle.draw();
        ellipse.draw();
    }
}

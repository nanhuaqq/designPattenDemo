package com.xty.qq.flyweight.decorator;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeDecorator redBorderShapeDecorator = new RedBorderShapeDecorator(circle);
        ShapeDecorator redBorderShapeDecorator2 = new RedBorderShapeDecorator(rectangle);

        redBorderShapeDecorator.draw();

        redBorderShapeDecorator2.draw();
    }
}

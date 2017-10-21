package com.xty.qq.abstractfactory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class AbstractFactoryPattenDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstracFactory colorFactory =  factoryProducer.produceFactory("colorFactory");
        AbstracFactory shapeFactory = factoryProducer.produceFactory("shapeFactory");

        Color yellow = colorFactory.createColor("yellow");
        Color blue = colorFactory.createColor("blue");
        Color red = colorFactory.createColor("red");

        Shape cirlce = shapeFactory.createShape("circle");
        Shape rectangle = shapeFactory.createShape("rectangle");
        Shape ellipse = shapeFactory.createShape("ellipse");

        yellow.fill();
        blue.fill();
        red.fill();

        cirlce.draw();
        rectangle.draw();
        ellipse.draw();
    }
}

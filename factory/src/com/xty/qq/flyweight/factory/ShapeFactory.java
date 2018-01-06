package com.xty.qq.flyweight.factory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class ShapeFactory {
    public Shape createShape(String shapeName){
        if (shapeName.equals("circle")){
            return new Circle();
        }else if (shapeName.equals("rectangle")){
            return new Rectangle();
        }else {
            return new Ellipse();
        }
    }
}

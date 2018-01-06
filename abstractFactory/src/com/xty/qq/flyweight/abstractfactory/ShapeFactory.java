package com.xty.qq.flyweight.abstractfactory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class ShapeFactory implements AbstracFactory {
    @Override
    public Shape createShape(String shapeName) {
        if (shapeName.equals("circle")){
            return new Circle();
        }else if (shapeName.equals("rectangle")){
            return new Rectangle();
        }else{
            return new Ellipse();
        }
    }

    @Override
    public Color createColor(String colorName) {
        return null;
    }
}

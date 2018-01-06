package com.xty.qq.flyweight.abstractfactory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class ColorFactory implements AbstracFactory{
    @Override
    public Shape createShape(String shapeName) {
        return null;
    }

    @Override
    public Color createColor(String colorName) {
        if (colorName.equals("yellow")){
            return new Yellow();
        }else if (colorName.equals("blue")){
            return new Blue();
        }else{
            return new Red();
        }
    }
}

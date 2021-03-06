package com.xty.qq.flyweight.abstractfactory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class FactoryProducer {
    public static AbstracFactory produceFactory(String factoryName){
        if (factoryName.equals("colorFactory")){
            return new ColorFactory();
        }else{
            return new ShapeFactory();
        }
    }
}

package com.xty.qq.abstractfactory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public class FactoryProducer {
    AbstracFactory produceFactory(String factoryName){
        if (factoryName.equals("colorFactory")){
            return new ColorFactory();
        }else{
            return new ShapeFactory();
        }
    }
}

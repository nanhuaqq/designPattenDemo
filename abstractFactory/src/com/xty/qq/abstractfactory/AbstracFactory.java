package com.xty.qq.abstractfactory;

/**
 * Created by Administrator on 2017/10/21 0021.
 */
public interface AbstracFactory {
    Shape createShape(String shapeName);
    Color createColor(String colorName);
}

package com.xty.qq.flyweight.facade;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawEllipse();
    }
}

package com.xty.qq.decorator;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class RedBorderShapeDecorator extends ShapeDecorator{
    public RedBorderShapeDecorator(Shape decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        setRedBorder();
        super.decorator.draw();
    }

    public void setRedBorder(){
        System.out.println("set red border");
    }
}

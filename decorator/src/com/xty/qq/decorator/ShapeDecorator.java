package com.xty.qq.decorator;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public abstract class ShapeDecorator implements Shape{
    public Shape decorator;

    public ShapeDecorator(Shape decorator) {
        this.decorator = decorator;
    }
}

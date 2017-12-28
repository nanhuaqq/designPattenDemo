package com.xty.qq.facade;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class ShapeMaker {

    public final Shape circle;

    public final Shape ellipse;

    public ShapeMaker(Circle circle, Ellipse ellipse) {
        this.circle = circle;
        this.ellipse = ellipse;
    }

    public ShapeMaker() {
        circle = new Circle();
        ellipse = new Ellipse();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawEllipse(){
        ellipse.draw();
    }
}

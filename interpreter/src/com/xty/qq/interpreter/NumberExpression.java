package com.xty.qq.interpreter;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
public class NumberExpression implements Expression{
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String s) {
        this.number = Integer.parseInt(s);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}

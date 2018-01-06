package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("you become invisible. potion = "+this.hashCode());
    }
}

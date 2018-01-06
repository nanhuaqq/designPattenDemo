package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("you feel blessed. potion = "+this.hashCode());
    }
}

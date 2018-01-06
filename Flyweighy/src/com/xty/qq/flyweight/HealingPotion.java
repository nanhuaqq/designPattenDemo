package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel healed. potion = "+this.hashCode());
    }
}

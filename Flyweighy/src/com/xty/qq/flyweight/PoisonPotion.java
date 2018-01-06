package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class PoisonPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("Urgh! this is poisonous. potion = "+this.hashCode());
    }
}

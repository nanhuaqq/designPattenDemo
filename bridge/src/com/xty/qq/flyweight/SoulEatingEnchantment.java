package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("The item spreads bloodlust");
    }

    @Override
    public void apply() {
        System.out.println("The item eats the soul of enemies");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust slowly disappears");
    }
}

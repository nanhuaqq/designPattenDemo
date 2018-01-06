package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class Hammer implements Weapon {
    public final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The hammer is wielded");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The hammer is swinged");
    }

    @Override
    public void unwield() {
        System.out.println("The hammer is unwielded");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchatment() {
        return enchantment;
    }
}

package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class Sword implements Weapon {
    public final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The sword isWield");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The sword is swinged");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The sword is unwielded");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchatment() {
        return enchantment;
    }
}

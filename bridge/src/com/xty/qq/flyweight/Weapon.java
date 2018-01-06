package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public interface Weapon {
    void wield();

    void swing();

    void unwield();

    Enchantment getEnchatment();
}

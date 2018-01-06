package com.xty.qq.flyweight;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class FlyingEnchatment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("The item begins to glow faintly");
    }

    @Override
    public void apply() {
        System.out.println("The item flies and strikes the enemies finally returning to owner's hand");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The item's glow fades");
    }
}

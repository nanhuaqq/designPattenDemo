package com.xty.qq.command;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public class Goblin extends Target {

    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }

}

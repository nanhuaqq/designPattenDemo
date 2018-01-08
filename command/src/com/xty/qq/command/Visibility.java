package com.xty.qq.command;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public enum Visibility {
    VISIBLE("visible"),INVISIBLE("invisible");

    private String title;

    Visibility(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}

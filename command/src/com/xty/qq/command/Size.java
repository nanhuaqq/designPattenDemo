package com.xty.qq.command;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public enum  Size {
    SMALL("small"),NORMAL("normal");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

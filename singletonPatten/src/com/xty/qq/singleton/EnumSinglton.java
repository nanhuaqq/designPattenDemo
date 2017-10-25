package com.xty.qq.singleton;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public enum EnumSinglton {
    INSTANCE;

    public void dosomething(){
        System.out.println("enum singleton");
    }
}

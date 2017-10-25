package com.xty.qq.singleton;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class StaticBlockSingleton {

    private static  StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton INSTANCE");
        }
    }

    private StaticBlockSingleton(){}

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }
}

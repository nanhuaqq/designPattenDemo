package com.xty.qq.singleton;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton(){}

    public static synchronized  SynchronizedSingleton  getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SynchronizedSingleton();
        }
        return INSTANCE;
    }
}

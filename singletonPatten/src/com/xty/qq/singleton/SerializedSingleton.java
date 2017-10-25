package com.xty.qq.singleton;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class SerializedSingleton implements Serializable{

    private SerializedSingleton(){
    }

    private static class SerializedSingletonHelper{
        public static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SerializedSingletonHelper.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

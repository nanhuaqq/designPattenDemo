package com.xty.qq.flyweight.singleton;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}

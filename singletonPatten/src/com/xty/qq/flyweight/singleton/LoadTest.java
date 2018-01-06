package com.xty.qq.flyweight.singleton;

/**
 * Created by Administrator on 2017/10/26 0026.
 */
public class LoadTest {
    public static void main(String[] args) {
        System.out.println("为了验证静态块加载和静态内部类加载");
        StaticBlockSingleton.getInstance();
        BillPughSingleton.getInstance();
    }
}

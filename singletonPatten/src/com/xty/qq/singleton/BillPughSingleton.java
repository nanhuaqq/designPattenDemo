package com.xty.qq.singleton;

public class BillPughSingleton{
    private BillPughSingleton(){
        System.out.println("Bill Pugh init");
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

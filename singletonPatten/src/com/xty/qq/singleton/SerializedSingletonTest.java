package com.xty.qq.singleton;

import java.io.*;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class SerializedSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
        oos.writeObject(SerializedSingleton.getInstance());
        System.out.println(SerializedSingleton.getInstance().hashCode());

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
        SerializedSingleton anotherSingleton = (SerializedSingleton) ois.readObject();
        System.out.println(anotherSingleton.hashCode());
    }
}

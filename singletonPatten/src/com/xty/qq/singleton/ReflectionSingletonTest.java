package com.xty.qq.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class ReflectionSingletonTest {
    public static void main(String[] args) {
//        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
//        System.out.println(eagerSingleton.hashCode());
//
//
//        Constructor [] constructors = EagerSingleton.class.getDeclaredConstructors();
//        Arrays.asList(constructors).forEach(constructor -> {
//            constructor.setAccessible(true);
//            try {
//                EagerSingleton anotherEagerSingleton = (EagerSingleton) constructor.newInstance();
//                System.out.println(anotherEagerSingleton.hashCode());
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        });

        EnumSinglton enumSinglton = EnumSinglton.INSTANCE;
        System.out.println(enumSinglton.hashCode());


        Constructor [] constructors = EnumSinglton.class.getDeclaredConstructors();
        Arrays.asList(constructors).forEach(constructor -> {
            constructor.setAccessible(true);
            try {
                EnumSinglton anotherEnumSingleton = (EnumSinglton) constructor.newInstance();
                System.out.println(anotherEnumSingleton.hashCode());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });

    }
}

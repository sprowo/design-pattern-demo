package com.prowo.design.pattern.singleton.eg2;

/**
 * 懒汉式，线程安全
 *
 * @author prowo
 * @date 2018/5/30
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

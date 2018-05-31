package com.prowo.design.pattern.singleton.eg3;

/**
 * 双重检验锁
 *
 * @author prowo
 * @date 2018/5/30
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

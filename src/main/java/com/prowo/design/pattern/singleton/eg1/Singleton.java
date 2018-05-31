package com.prowo.design.pattern.singleton.eg1;

/**
 * 懒汉式，线程不安全
 *
 * @author prowo
 * @date 2018/5/30
 */
public class Singleton {

    private static Singleton instance;

    // 私有构造方法，防止被实例化
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

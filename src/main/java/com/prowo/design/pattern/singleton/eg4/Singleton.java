package com.prowo.design.pattern.singleton.eg4;

/**
 * 饿汉式 static final
 *
 * @author prowo
 * @date 2018/5/30
 */
public class Singleton {

    //类加载时就初始化
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}

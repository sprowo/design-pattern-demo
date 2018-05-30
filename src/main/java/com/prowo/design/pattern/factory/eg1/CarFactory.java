package com.prowo.design.pattern.factory.eg1;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class CarFactory {

    public static ICar getCar(String name) {
        switch (name) {
            case "bmw":
                return new BMW();
            case "benz":
                return new Benz();
            default:
                return null;
        }
    }

}

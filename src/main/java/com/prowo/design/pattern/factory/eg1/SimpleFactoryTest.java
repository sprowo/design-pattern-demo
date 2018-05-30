package com.prowo.design.pattern.factory.eg1;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICar bmw = CarFactory.getCar("bmw");
        ICar benz = CarFactory.getCar("benz");
        bmw.run();
        benz.run();
    }

}

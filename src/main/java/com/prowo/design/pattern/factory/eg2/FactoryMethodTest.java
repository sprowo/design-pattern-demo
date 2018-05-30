package com.prowo.design.pattern.factory.eg2;


import com.prowo.design.pattern.factory.eg1.ICar;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICar bmw = CarFactory.getBMW();
        ICar benz = CarFactory.getBenz();
        bmw.run();
        benz.run();
    }

}

package com.prowo.design.pattern.factory.eg3;

import com.prowo.design.pattern.factory.eg1.ICar;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICarFactory ICarFactory = new BMWFactory();
        ICar car = ICarFactory.getCar();
        car.run();
    }

}

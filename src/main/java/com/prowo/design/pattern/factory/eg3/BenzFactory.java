package com.prowo.design.pattern.factory.eg3;

import com.prowo.design.pattern.factory.eg1.Benz;
import com.prowo.design.pattern.factory.eg1.ICar;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class BenzFactory implements ICarFactory {
    @Override
    public ICar getCar() {
        return new Benz();
    }
}

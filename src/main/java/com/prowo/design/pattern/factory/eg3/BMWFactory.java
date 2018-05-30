package com.prowo.design.pattern.factory.eg3;

import com.prowo.design.pattern.factory.eg1.BMW;
import com.prowo.design.pattern.factory.eg1.ICar;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class BMWFactory implements ICarFactory {
    @Override
    public ICar getCar() {
        return new BMW();
    }
}

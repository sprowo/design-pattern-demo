package com.prowo.design.pattern.factory.eg2;

import com.prowo.design.pattern.factory.eg1.BMW;
import com.prowo.design.pattern.factory.eg1.Benz;
import com.prowo.design.pattern.factory.eg1.ICar;

/**
 * @author prowo
 * @date 2018/5/30
 */
public class CarFactory {

    public static ICar getBMW() {
        return new BMW();
    }

    public static ICar getBenz() {
        return new Benz();
    }

}

package org.xiaohu.design_patterns.pattern.factory.factoryMethod;

/**
 * @Author xiaohu
 * @Date 2024/11/5 17:22
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.factoryMethod
 * @ClassName: AmericanCoffeeFactory
 * @Description: 美式咖啡工厂；专门生产美式咖啡
 * @Version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}

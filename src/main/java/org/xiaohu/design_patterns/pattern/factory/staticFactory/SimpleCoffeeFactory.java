package org.xiaohu.design_patterns.pattern.factory.staticFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/5 10:41
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.simpleFactory
 * @ClassName: SimpleCoffeeFactory
 * @Description: 简单咖啡工厂 用来生产咖啡
 * @Version 1.0
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("咖啡类型不存在");
        }

        return coffee;
    }
}

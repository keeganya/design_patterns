package org.xiaohu.design_patterns.pattern.factory.simpleFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/5 14:09
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.simpleFactory
 * @ClassName: CoffeeStore
 * @Description: 咖啡店
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

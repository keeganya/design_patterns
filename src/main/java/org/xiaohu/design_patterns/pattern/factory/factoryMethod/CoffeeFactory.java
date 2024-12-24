package org.xiaohu.design_patterns.pattern.factory.factoryMethod;

/**
 * @Author xiaohu
 * @Date 2024/11/5 17:20
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.factoryMethod
 * @ClassName: CoffeeFactory
 * @Description: 咖啡工厂 抽象工厂
 * @Version 1.0
 */
public interface CoffeeFactory {
    // 创建咖啡的抽象方法
    Coffee createCoffee();
}

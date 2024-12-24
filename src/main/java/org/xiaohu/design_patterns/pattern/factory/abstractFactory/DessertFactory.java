package org.xiaohu.design_patterns.pattern.factory.abstractFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 9:38
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.abstractFactory
 * @ClassName: DessertFactory
 * @Description: 风味工厂接口
 * @Version 1.0
 */
public interface DessertFactory {
    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜点的功能
    Dessert createDessert();
}

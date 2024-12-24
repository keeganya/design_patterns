package org.xiaohu.design_patterns.pattern.factory.abstractFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 9:43
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.abstractFactory
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 美式风味工厂
        AmericanDessertFactory factory = new AmericanDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}

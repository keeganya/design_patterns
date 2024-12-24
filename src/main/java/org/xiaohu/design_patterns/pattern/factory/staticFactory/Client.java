package org.xiaohu.design_patterns.pattern.factory.staticFactory;


/**
 * @Author xiaohu
 * @Date 2024/11/5 14:13
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.simpleFactory
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}

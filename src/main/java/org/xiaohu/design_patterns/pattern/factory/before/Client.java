package org.xiaohu.design_patterns.pattern.factory.before;

/**
 * @Author xiaohu
 * @Date 2024/11/5 10:18
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.before
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee coffee = coffeeStore.orderCoffee("american");

        System.out.println(coffee.getName());
    }
}

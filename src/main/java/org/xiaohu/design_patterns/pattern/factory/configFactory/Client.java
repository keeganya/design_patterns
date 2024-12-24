package org.xiaohu.design_patterns.pattern.factory.configFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 10:24
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.configFactory
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffe("american");
        System.out.println(coffee.getName());

        Coffee coffee1 = CoffeeFactory.createCoffe("latte");
        System.out.println(coffee1.getName());
    }
}

package org.xiaohu.design_patterns.pattern.factory.factoryMethod;

/**
 * @Author xiaohu
 * @Date 2024/11/5 17:26
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.factoryMethod
 * @ClassName: Client
 * @Description: 类爆炸 新增咖啡品类时，需要新增咖啡类，咖啡工厂
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 咖啡店对象
        CoffeeStore store = new CoffeeStore();

        // 创建需要的咖啡工厂对象
        LatteCoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);

        // 点咖啡
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}

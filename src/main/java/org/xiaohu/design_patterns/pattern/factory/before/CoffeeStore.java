package org.xiaohu.design_patterns.pattern.factory.before;

/**
 * @Author xiaohu
 * @Date 2024/11/5 10:13
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.before
 * @ClassName: CoffeeStore
 * @Description: 咖啡店
 *               存在问题：新增一种咖啡 需要修改这里的代码，增加一种判断逻辑（违反开闭原则）
 * @Version 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;

        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("咖啡类型不存在");
        }

        // 加料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

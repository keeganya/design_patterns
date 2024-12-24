package org.xiaohu.design_patterns.pattern.factory.factoryMethod;

/**
 * @Author xiaohu
 * @Date 2024/11/5 17:24
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.factoryMethod
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Version 1.0
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    // 点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        // 加料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

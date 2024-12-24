package org.xiaohu.design_patterns.pattern.factory.abstractFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 9:41
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.abstractFactory
 * @ClassName: ItalyDessertFactory
 * @Description: 意大利风味工厂
 * @Version 1.0
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}

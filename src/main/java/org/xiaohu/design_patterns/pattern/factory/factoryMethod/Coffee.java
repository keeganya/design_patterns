package org.xiaohu.design_patterns.pattern.factory.factoryMethod;

/**
 * @Author xiaohu
 * @Date 2024/11/5 17:16
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.factoryMethod
 * @ClassName: Coffee
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}

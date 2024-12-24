package org.xiaohu.design_patterns.pattern.factory.abstractFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 9:15
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.abstractFactory
 * @ClassName: Coffee
 * @Description: 抽象咖啡类
 * @Version 1.0
 */
public abstract class Coffee {
    public abstract String getName();

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }
}

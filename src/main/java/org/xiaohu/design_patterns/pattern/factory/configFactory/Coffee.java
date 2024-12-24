package org.xiaohu.design_patterns.pattern.factory.configFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 10:02
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.configFactory
 * @ClassName: Coffee
 * @Description: 抽象咖啡类
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

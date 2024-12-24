package org.xiaohu.design_patterns.pattern.factory.staticFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/5 10:07
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.before
 * @ClassName: Coffee
 * @Description: 咖啡类
 * @Version 1.0
 */
public abstract class Coffee {

    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }

}

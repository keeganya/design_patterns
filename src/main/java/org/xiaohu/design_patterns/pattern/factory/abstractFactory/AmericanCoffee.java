package org.xiaohu.design_patterns.pattern.factory.abstractFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 9:17
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.abstractFactory
 * @ClassName: AmericanCoffee
 * @Description: 美式咖啡类
 * @Version 1.0
 */
public class AmericanCoffee extends Coffee{
    @Override
    public String getName() {
        return "美式咖啡";
    }
}

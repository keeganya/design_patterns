package org.xiaohu.design_patterns.pattern.factory.simpleFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/5 10:09
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.before
 * @ClassName: AmericanCoffee
 * @Description: 美式咖啡
 * @Version 1.0
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getName() {
        return "美式咖啡";
    }
}

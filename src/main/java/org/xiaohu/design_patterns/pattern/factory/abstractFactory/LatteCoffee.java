package org.xiaohu.design_patterns.pattern.factory.abstractFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/6 9:18
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.abstractFactory
 * @ClassName: LatteCoffee
 * @Description: 拿铁咖啡类
 * @Version 1.0
 */
public class LatteCoffee extends Coffee{
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}

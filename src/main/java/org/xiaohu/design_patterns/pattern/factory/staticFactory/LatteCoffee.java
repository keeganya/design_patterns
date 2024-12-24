package org.xiaohu.design_patterns.pattern.factory.staticFactory;

/**
 * @Author xiaohu
 * @Date 2024/11/5 10:10
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.before
 * @ClassName: LatteCoffee
 * @Description: 拿铁咖啡
 * @Version 1.0
 */
public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}

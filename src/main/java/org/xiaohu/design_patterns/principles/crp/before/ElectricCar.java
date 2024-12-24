package org.xiaohu.design_patterns.principles.crp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:30
 * @PackageName:org.xiaohu.design_patterns.principles.crp.before
 * @ClassName: ElectricCar
 * @Description: 电动车
 * @Version 1.0
 */
public class ElectricCar extends Car{
    @Override
    void move() {
        System.out.println("电车在跑");
    }
}

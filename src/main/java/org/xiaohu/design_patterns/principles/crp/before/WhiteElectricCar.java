package org.xiaohu.design_patterns.principles.crp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:30
 * @PackageName:org.xiaohu.design_patterns.principles.crp.before
 * @ClassName: RedPetrolCar
 * @Description: 白色电车
 * @Version 1.0
 */
public class WhiteElectricCar extends ElectricCar {
    @Override
    void move() {
        System.out.println("白色电车在跑");
    }
}

package org.xiaohu.design_patterns.principles.crp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:30
 * @PackageName:org.xiaohu.design_patterns.principles.crp.before
 * @ClassName: RedPetrolCar
 * @Description: 红色汽油车
 * @Version 1.0
 */
public class RedPetrolCar extends PetrolCar {
    @Override
    void move() {
        System.out.println("红色汽油车在跑");
    }
}

package org.xiaohu.design_patterns.principles.crp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:29
 * @PackageName:org.xiaohu.design_patterns.principles.crp.before
 * @ClassName: PetrolCar
 * @Description: 汽油车
 * @Version 1.0
 */
public class PetrolCar extends Car{
    @Override
    void move() {
        System.out.println("汽油车在跑");
    }
}

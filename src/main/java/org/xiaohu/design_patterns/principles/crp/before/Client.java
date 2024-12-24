package org.xiaohu.design_patterns.principles.crp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:36
 * @PackageName:org.xiaohu.design_patterns.principles.crp.before
 * @ClassName: Client
 * @Description: 如果新增一种红色氢能车，需要先继续继承Car类，获得氢能车类，在继承氢能车类，获得白色氢能车类
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 汽油车
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.move();

        // 白色电车
        WhiteElectricCar whiteElectricCar = new WhiteElectricCar();
        whiteElectricCar.move();
    }
}

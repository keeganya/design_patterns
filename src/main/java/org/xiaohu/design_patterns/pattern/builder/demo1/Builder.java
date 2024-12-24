package org.xiaohu.design_patterns.pattern.builder.demo1;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:13
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo1
 * @ClassName: Builder
 * @Description: 抽象建造者类
 * @Version 1.0
 */
public abstract class Builder {
    // 声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    // 建造车架方法
    public abstract void buildFrame();

    // 建造车座方法
    public abstract void buildSeat();

    // 构建自行车的方法
    public abstract Bike createBike();
}

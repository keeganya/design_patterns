package org.xiaohu.design_patterns.pattern.builder.demo1;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:20
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo1
 * @ClassName: Director
 * @Description: 指挥者类
 * @Version 1.0
 */
public class Director {
    // 声明builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

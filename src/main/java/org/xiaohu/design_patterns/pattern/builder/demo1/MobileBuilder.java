package org.xiaohu.design_patterns.pattern.builder.demo1;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:16
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo1
 * @ClassName: MobileBuilder
 * @Description: 具体的构造者 构造摩拜单车对象
 * @Version 1.0
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

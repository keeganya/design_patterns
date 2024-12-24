package org.xiaohu.design_patterns.pattern.builder.demo1;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:17
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo1
 * @ClassName: OfoBuilder
 * @Description: TODO
 * @Version 1.0
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

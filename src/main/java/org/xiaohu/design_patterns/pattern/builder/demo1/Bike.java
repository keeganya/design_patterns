package org.xiaohu.design_patterns.pattern.builder.demo1;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:11
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo1
 * @ClassName: Bike
 * @Description: 自行车类
 * @Version 1.0
 */
public class Bike {
    // 车架
    private String frame;

    // 车座
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}

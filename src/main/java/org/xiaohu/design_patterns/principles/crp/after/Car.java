package org.xiaohu.design_patterns.principles.crp.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:40
 * @PackageName:org.xiaohu.design_patterns.principles.crp.after
 * @ClassName: Car
 * @Description: 汽车类
 * @Version 1.0
 */
public class Car {
    private Color color;
    void move() {
        System.out.println("车在跑");
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

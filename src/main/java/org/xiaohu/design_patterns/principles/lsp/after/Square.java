package org.xiaohu.design_patterns.principles.lsp.after;

/**
 * @Author xiaohu
 * @Date 2024/10/31 17:53
 * @PackageName:org.xiaohu.design_patterns.principles.lsp.after
 * @ClassName: Square
 * @Description: 正方形类
 * @Version 1.0
 */
public class Square implements Quadrilateral {
    private double side;
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getLength() {
        return side;
    }
    public double getWidth() {
        return side;
    }

}

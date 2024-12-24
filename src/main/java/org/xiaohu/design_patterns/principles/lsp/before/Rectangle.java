package org.xiaohu.design_patterns.principles.lsp.before;

/**
 * @Author xiaohu
 * @Date 2024/10/31 15:55
 * @PackageName:org.xiaohu.design_patterns.principles.lsp.before
 * @ClassName: Rectangle
 * @Description: 长方形类
 * @Version 1.0
 */
public class Rectangle {
    private double length;
    private double width;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

}

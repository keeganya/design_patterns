package org.xiaohu.design_patterns.principles.lsp.after;

/**
 * @Author xiaohu
 * @Date 2024/10/31 17:35
 * @PackageName:org.xiaohu.design_patterns.principles.lsp.after
 * @ClassName: Rectangle
 * @Description: 长方形类 (不重写getLength(),getWidth()方法，但是覆盖掉了这两个方法)
 * @Version 1.0
 */
public class Rectangle implements Quadrilateral {
    private double length;
    private double width;

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {return length;}
    public double getWidth() {return width;}
}

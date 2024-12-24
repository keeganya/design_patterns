package org.xiaohu.design_patterns.principles.lsp.before;

/**
 * @Author xiaohu
 * @Date 2024/10/31 16:14
 * @PackageName:org.xiaohu.design_patterns.principles.lsp.before
 * @ClassName: RectangleDemo
 * @Description: TODO
 * @Version 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        // 设置长和宽
        r.setLength(20);
        r.setWidth(10);
        // 调用resize方法进行扩展
        resize(r);
        printLengthAndWidth(r);

        System.out.println("===================");

        // 创建正方形对象
        Square s = new Square();
        // 设置长和宽
        s.setLength(10);
        // 使用resize方法进行扩宽
        resize(s); // while进入死循环（Square会把 长 和 宽 都同时赋值为相同的值（+1 后的值））
        printLengthAndWidth(s);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}

package org.xiaohu.design_patterns.principles.lsp.after;


/**
 * @Author xiaohu
 * @Date 2024/10/31 17:58
 * @PackageName:org.xiaohu.design_patterns.principles.lsp.after
 * @ClassName: RectangleDemo
 * @Description: 里氏代换原则
 *                  子类可以扩展父类的功能，但不能改变父类原有的功能
 *  *               子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法
 * @Version 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        // 调用方法进行扩宽操作
        resize(r);

        printLengthAndWidth(r);
    }

    // 扩宽的方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

}

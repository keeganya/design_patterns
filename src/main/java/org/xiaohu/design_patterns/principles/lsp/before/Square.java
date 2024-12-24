package org.xiaohu.design_patterns.principles.lsp.before;

/**
 * @Author xiaohu
 * @Date 2024/10/31 15:58
 * @PackageName:org.xiaohu.design_patterns.principles.lsp.before
 * @ClassName: Square
 * @Description: 正方形类（修改了父类的功能，不符合里氏代换原则）
 *               里氏代换原则：
 *               子类可以扩展父类的功能，但不能改变父类原有的功能
 *               子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法
 * @Version 1.0
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}

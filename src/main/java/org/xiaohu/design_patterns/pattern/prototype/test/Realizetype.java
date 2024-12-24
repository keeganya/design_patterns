package org.xiaohu.design_patterns.pattern.prototype.test;

/**
 * @Author xiaohu
 * @Date 2024/11/6 14:03
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.test
 * @ClassName: Realizetype
 * @Description: 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，
 *               仍指向【原有属性】所指向的对象的内存地址。
 *               深克隆：创建一个新对象，【属性】中引用的其他对象也会被克隆，不再指向原有对象地址。
 * @Version 1.0
 */
public class Realizetype implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public Realizetype() {
        System.out.println("具体原型对象创建完成!");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");

        return (Realizetype)super.clone();
    }
}

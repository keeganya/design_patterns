package org.xiaohu.design_patterns.pattern.prototype.test;

/**
 * @Author xiaohu
 * @Date 2024/11/6 14:05
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.test
 * @ClassName: Client
 * @Description: 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，
 *               仍指向【原有属性】所指向的对象的内存地址。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();// 原型对象

        // 调用Realizetype类中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone(); // 克隆对象

        // 不管浅克隆还是深克隆，都会创建一个新的对象。这里是浅克隆（cloneable接口是浅克隆），非基本类型的属性仍指向【原有属性】所指向的对象的内存地址。
        System.out.println("原型对象和克隆出来的是否是同一个对象?" + (realizetype == clone)); // false

        System.out.println(realizetype.getName() == clone.getName()); // true
    }
}

package org.xiaohu.design_patterns.pattern.singleton.hunger.staticMemVar;

/**
 * @Author xiaohu
 * @Date 2024/11/4 10:24
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.hunger.staticMemVar
 * @ClassName: Singleton
 * @Description: 饿汉式：静态成员变量
 * @Version 1.0
 */
public class Singleton {
    // 1.私有构造方法(外界无法访问，所以无法创建对象)
    private Singleton(){}

    // 2.在本类中创建本类对象（只能通过本类自己创建对象）
    private static Singleton instance = new Singleton();

    // 3.提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}

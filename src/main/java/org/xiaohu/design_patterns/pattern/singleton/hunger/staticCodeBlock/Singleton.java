package org.xiaohu.design_patterns.pattern.singleton.hunger.staticCodeBlock;

/**
 * @Author xiaohu
 * @Date 2024/11/4 10:41
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.hunger.staticCodeBlock
 * @ClassName: Singleton
 * @Description: 饿汉式：静态代码块
 * @Version 1.0
 */
public class Singleton {
    // 1.私有构造方法（外界无法方法，所以外界无法创建对象）
    private Singleton(){}

    // 2.声明Singleton类型的变量
    private static Singleton instance; // null

    // 3.在静态代码块中赋值
    static {
        instance = new Singleton();
    }

    // 4.对外提供获取该类方法
    public static Singleton getInstance() {
        return instance;
    }
}

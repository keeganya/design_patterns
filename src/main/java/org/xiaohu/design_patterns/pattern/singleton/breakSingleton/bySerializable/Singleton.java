package org.xiaohu.design_patterns.pattern.singleton.breakSingleton.bySerializable;

import java.io.Serializable;

/**
 * @Author xiaohu
 * @Date 2024/11/4 16:53
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.breakSingleton.bySerializable
 * @ClassName: Singleton
 * @Description: 静态内部类实现懒汉式单例 【序列化破坏单例】
 * @Version 1.0
 */
public class Singleton implements Serializable {
    // 1.私有构造方法
    private Singleton(){}

    // 2.静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.对外提供访问方式
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化时，会自动调用该方法，将该方法的返回值返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}

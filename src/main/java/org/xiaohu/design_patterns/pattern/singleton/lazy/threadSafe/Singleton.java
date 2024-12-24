package org.xiaohu.design_patterns.pattern.singleton.lazy.threadSafe;

/**
 * @Author xiaohu
 * @Date 2024/11/4 14:11
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.lazy.threadSafe
 * @ClassName: Singleton
 * @Description: 线程安全的懒汉单例
 * @Version 1.0
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton(){}

    // 2.声明Singleton类型的变量instance
    private static Singleton instance;

    // 3.提供对外访问方式
    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

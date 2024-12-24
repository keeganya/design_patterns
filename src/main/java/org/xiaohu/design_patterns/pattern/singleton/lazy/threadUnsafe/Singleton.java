package org.xiaohu.design_patterns.pattern.singleton.lazy.threadUnsafe;

/**
 * @Author xiaohu
 * @Date 2024/11/4 13:57
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.lazy.threadUnsafe
 * @ClassName: Singleton
 * @Description: 线程不安全的懒汉式单例
 * @Version 1.0
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton(){}

    // 2.声明Singleton类型的变量instance
    private static Singleton instance;

    // 3.对外提供公共访问方式
    public static Singleton getInstance(){
        /* 当多线程获取该对象时，多个线程同时进行instance == null的判断，
           这是【多个线程都判断为空成立】，就会创建多个对象
        * */
        if (instance == null) { // 不加上instance == null判断，会导致每次获取instance时都创建新的instance对象
            // 4.instance赋值
            instance = new Singleton();
        }
        return instance;
    }
}

package org.xiaohu.design_patterns.pattern.singleton.lazy.doubleCheck;

/**
 * @Author xiaohu
 * @Date 2024/11/4 14:28
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.lazy.doubleCheck
 * @ClassName: Singleton
 * @Description: 双重检查的懒汉式单例
 * @Version 1.0
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton(){}

    // 2.声明Singleton类型的instance变量
    /* 可能会出现空指针问题，
       出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
       加上volatile
    * */
    private static volatile Singleton instance;

    // 3.对外提供访问方式
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // 对写操作加锁
                if (instance == null) { // 第二次判断，当线程A 和 线程B依次进入到这里，没有判断的话会创建多个对象
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

package org.xiaohu.design_patterns.pattern.singleton.lazy.staticInnerClass;

/**
 * @Author xiaohu
 * @Date 2024/11/4 14:48
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.lazy.staticInnerClass
 * @ClassName: Singleton
 * @Description: 静态内部类实现懒汉式单例
 *               对象由内部类创建，由于【jvm在加载外部类的过程中，不会加载静态内部类】，
 *               只有【内部类的属性/方法被调用时才会被加载，并初始化器静态属性】。
 *               静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序
 * @Version 1.0
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton(){}

    // 2.静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.对外提供访问方式
    public static Singleton getInstance() {
        /* 第一次加载Singleton类时不会去初始化INSTANCE,
           只有第一次调用getInstance,虚拟机加载SingletonHolder并初始化INSTANCE，
           并且只初始化一次，这样不仅能确保线程安全，也能保证SIngleton类的唯一性
        * */
        return SingletonHolder.INSTANCE;
    }
}

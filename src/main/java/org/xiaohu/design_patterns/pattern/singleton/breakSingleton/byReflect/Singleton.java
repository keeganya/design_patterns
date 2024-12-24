package org.xiaohu.design_patterns.pattern.singleton.breakSingleton.byReflect;

/**
 * @Author xiaohu
 * @Date 2024/11/4 17:23
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.breakSingleton.byReflect
 * @ClassName: Singleton
 * @Description: TODO
 * @Version 1.0
 */
public class Singleton {

    private static boolean flag = false;

    // 1.私有构造方法
    private Singleton() {
        synchronized (Singleton.class) { // 保证多线程下线程安全
            if (flag) { //判断flag的值是否是true，如果是true，说明非第一次访问，直接抛一个异常，如果是false的话，说明第一次访问
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    // 2.静态内部类
    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    // 3.对外提供访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

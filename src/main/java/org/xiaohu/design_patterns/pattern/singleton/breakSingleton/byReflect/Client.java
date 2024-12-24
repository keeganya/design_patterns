package org.xiaohu.design_patterns.pattern.singleton.breakSingleton.byReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author xiaohu
 * @Date 2024/11/4 17:27
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.breakSingleton.byReflect
 * @ClassName: Client
 * @Description: 反射破坏单例
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.获取Singleton的字节码对象
        Class clazz = Singleton.class;
        // 2.获取无参构造方法对象
        Constructor constructors = clazz.getDeclaredConstructor();
        // 3.取消访问检查
        constructors.setAccessible(true);
        // 4.创建Singleton对象
        Singleton instance = ((Singleton) constructors.newInstance());
        Singleton instance1 = ((Singleton) constructors.newInstance());

        System.out.println(instance1 == instance);
    }
}

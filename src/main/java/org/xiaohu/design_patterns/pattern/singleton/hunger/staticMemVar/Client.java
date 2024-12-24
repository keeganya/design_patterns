package org.xiaohu.design_patterns.pattern.singleton.hunger.staticMemVar;

/**
 * @Author xiaohu
 * @Date 2024/11/4 10:28
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.hunger.staticMemVar
 * @ClassName: Client
 * @Description: 静态变量和静态代码块的饿汉式单例模式，都是在类加载的时候就创建对象
 *               如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建Singleton类的对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        // 判断获取到的两个是否适合同一个对象
        System.out.println(instance1 == instance);
    }
}

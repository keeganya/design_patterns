package org.xiaohu.design_patterns.pattern.singleton.hunger.staticCodeBlock;

/**
 * @Author xiaohu
 * @Date 2024/11/4 10:49
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.hunger.staticCodeBlock
 * @ClassName: Client
 * @Description: 静态变量和静态代码块的饿汉式单例模式，都是在类加载的时候就创建对象
 *               如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance1 == instance);
    }
}

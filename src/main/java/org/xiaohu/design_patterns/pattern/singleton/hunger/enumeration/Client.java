package org.xiaohu.design_patterns.pattern.singleton.hunger.enumeration;

/**
 * @Author xiaohu
 * @Date 2024/11/4 15:17
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.hunger.enumeration
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance1 == instance);
    }
}

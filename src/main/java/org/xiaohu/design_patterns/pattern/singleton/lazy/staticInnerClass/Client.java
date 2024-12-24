package org.xiaohu.design_patterns.pattern.singleton.lazy.staticInnerClass;

/**
 * @Author xiaohu
 * @Date 2024/11/4 15:10
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.lazy.staticInnerClass
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance1 == instance);
    }
}

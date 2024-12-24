package org.xiaohu.design_patterns.pattern.builder.demo2;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:44
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo2
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();

        System.out.println(phone);
    }
}

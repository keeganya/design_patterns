package org.xiaohu.design_patterns.pattern.builder.demo1;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:22
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo1
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象
//        Director director = new Director(new MobileBuilder());
        Director director = new Director(new OfoBuilder());

        // 指挥者组装
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}

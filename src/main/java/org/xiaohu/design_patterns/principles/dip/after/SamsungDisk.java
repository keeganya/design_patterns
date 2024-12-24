package org.xiaohu.design_patterns.principles.dip.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:50
 * @PackageName:org.xiaohu.design_patterns.principles.dip.after
 * @ClassName: SamsungDisk
 * @Description: 三星硬盘类
 * @Version 1.0
 */
public class SamsungDisk implements HardDisk{
    // 存储数据的方法
    @Override
    public void save(String data) {
        System.out.println("使用三星硬盘存储数据为：" + data);
    }

    // 获取数据的方法
    @Override
    public String get() {
        System.out.println("使用三星硬盘取数据");
        return "数据";
    }
}

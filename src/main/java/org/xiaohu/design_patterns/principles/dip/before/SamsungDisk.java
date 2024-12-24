package org.xiaohu.design_patterns.principles.dip.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:21
 * @PackageName:org.xiaohu.design_patterns.principles.dip.before
 * @ClassName: SamsungDisk
 * @Description: 三星硬盘
 * @Version 1.0
 */
public class SamsungDisk {
    // 存储数据的方法
    public void save(String data) {
        System.out.println("使用三星硬盘存储数据为：" + data);
    }

    // 获取数据的方法
    public String get() {
        System.out.println("使用三星硬盘取数据");
        return "数据";
    }
}

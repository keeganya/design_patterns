package org.xiaohu.design_patterns.principles.dip.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:46
 * @PackageName:org.xiaohu.design_patterns.principles.dip.after
 * @ClassName: HardDisk
 * @Description: 硬盘接口
 * @Version 1.0
 */
public interface HardDisk {
    // 存储数据
    public void save(String data);
    // 获取数据
    public String get();
}

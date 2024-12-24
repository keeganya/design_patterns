package org.xiaohu.design_patterns.principles.dip.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:59
 * @PackageName:org.xiaohu.design_patterns.principles.dip.after
 * @ClassName: KingstonMemory
 * @Description: 金士顿内存条
 * @Version 1.0
 */
public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("使用金士顿内存条");
    }
}

package org.xiaohu.design_patterns.principles.dip.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:57
 * @PackageName:org.xiaohu.design_patterns.principles.dip.after
 * @ClassName: InterCpu
 * @Description: Intel Cpu
 * @Version 1.0
 */
public class InterCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}

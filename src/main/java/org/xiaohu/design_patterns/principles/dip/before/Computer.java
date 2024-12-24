package org.xiaohu.design_patterns.principles.dip.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:27
 * @PackageName:org.xiaohu.design_patterns.principles.dip.before
 * @ClassName: Computer
 * @Description: 修改电脑组件品牌时，必须要修改这里的组件品牌类型代码
 * @Version 1.0
 */
public class Computer {
    private SamsungDisk harDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public SamsungDisk getHarDisk() {
        return harDisk;
    }

    public void setHarDisk(SamsungDisk harDisk) {
        this.harDisk = harDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = harDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}

package org.xiaohu.design_patterns.principles.dip.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:59
 * @PackageName:org.xiaohu.design_patterns.principles.dip.after
 * @ClassName: Computer
 * @Description: TODO
 * @Version 1.0
 */
public class Computer {
    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    // 运行计算机
    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}

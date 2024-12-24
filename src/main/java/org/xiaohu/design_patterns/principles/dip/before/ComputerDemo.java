package org.xiaohu.design_patterns.principles.dip.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 15:32
 * @PackageName:org.xiaohu.design_patterns.principles.dip.before
 * @ClassName: ComputerDemo
 * @Description: 每次组装电脑的disk,cpu,memory品牌都是固定的，
 *               如果想要修改品牌，必须去Computer类修改代码
 * @Version 1.0
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建组件对象
        SamsungDisk hardDisk = new SamsungDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();
        // 组装计算机
        computer.setCpu(cpu);
        computer.setHarDisk(hardDisk);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}

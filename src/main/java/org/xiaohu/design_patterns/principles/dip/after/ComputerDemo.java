package org.xiaohu.design_patterns.principles.dip.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:03
 * @PackageName:org.xiaohu.design_patterns.principles.dip.after
 * @ClassName: ComputerDemo
 * @Description: 【依赖倒转原则】如果想要修改品牌，直接增加一个组件品牌，在本类中生成该品牌组件对象即可
 *                高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。
 *                简单的说就是要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合。
 * @Version 1.0
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建计算机的组件对象
        HardDisk samsungDisk = new SamsungDisk();
        Cpu interCpu = new InterCpu();
        Memory kingstonMemory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();
        // 组装计算机
        computer.setCpu(interCpu);
        computer.setHardDisk(samsungDisk);
        computer.setMemory(kingstonMemory);

        // 运行计算机
        computer.run();
    }
}

package org.xiaohu.design_patterns.principles.isp.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:43
 * @PackageName:org.xiaohu.design_patterns.principles.isp.after
 * @ClassName: Client
 * @Description: 接口隔离原则
 *               不应该被迫依赖于它不使用的方法；一个类对另一个类的依赖应该建立在最小的接口上。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // Mydoor
        MyDoor myDoor = new MyDoor();

        myDoor.AntiTheft();
        myDoor.FireProof();
        myDoor.waterProof();

        System.out.println("==================");

        // XiaohuDoor
        XiaohuDoor xiaohuDoor = new XiaohuDoor();

        xiaohuDoor.AntiTheft();
        xiaohuDoor.FireProof();
    }
}

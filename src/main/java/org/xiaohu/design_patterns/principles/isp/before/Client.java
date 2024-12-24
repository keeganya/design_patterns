package org.xiaohu.design_patterns.principles.isp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:32
 * @PackageName:org.xiaohu.design_patterns.principles.isp.before
 * @ClassName: Client
 * @Description: 如果此时定义另一个门，只具有防盗，防火的功能，不具备防水的功能
 *               如果实现SafetyDoor接口，就必须重写防盗，防火，防水三种功能（被迫依赖于它不使用的方法）
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        MyDoor myDoor = new MyDoor();
        myDoor.antiTheft();
        myDoor.fireProof();
        myDoor.waterProof();
    }
}

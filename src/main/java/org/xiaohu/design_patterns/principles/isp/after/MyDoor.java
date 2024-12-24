package org.xiaohu.design_patterns.principles.isp.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:40
 * @PackageName:org.xiaohu.design_patterns.principles.isp.after
 * @ClassName: MyDoor
 * @Description: 具有防盗，防火，防水的门(实现多个接口)
 * @Version 1.0
 */
public class MyDoor implements AntiTheft,FireProof,WaterProof{
    @Override
    public void AntiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void FireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}

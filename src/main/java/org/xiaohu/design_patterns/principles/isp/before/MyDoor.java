package org.xiaohu.design_patterns.principles.isp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:31
 * @PackageName:org.xiaohu.design_patterns.principles.isp.before
 * @ClassName: MyDoor
 * @Description: TODO
 * @Version 1.0
 */
public class MyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}

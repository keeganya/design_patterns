package org.xiaohu.design_patterns.principles.isp.after;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:41
 * @PackageName:org.xiaohu.design_patterns.principles.isp.after
 * @ClassName: XiaohuDoor
 * @Description: 具有防盗，防火功能的门
 * @Version 1.0
 */
public class XiaohuDoor implements AntiTheft,FireProof{
    @Override
    public void AntiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void FireProof() {
        System.out.println("防火");
    }
}

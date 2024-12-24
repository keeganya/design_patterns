package org.xiaohu.design_patterns.principles.open_closed;

/**
 * @Author xiaohu
 * @Date 2024/10/31 15:28
 * @PackageName:org.xiaohu.design_patterns.principles.open_closed
 * @ClassName: XiaohuSkin
 * @Description: xiaohu专属输入法皮肤
 * @Version 1.0
 */
public class XiaohuSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("xiaohu专属皮肤");
    }
}

package org.xiaohu.design_patterns.principles.open_closed;

/**
 * @Author xiaohu
 * @Date 2024/10/31 15:26
 * @PackageName:org.xiaohu.design_patterns.principles.open_closed
 * @ClassName: DefaultSkin
 * @Description: 默认输入法皮肤类
 * @Version 1.0
 */
public class DefaultSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}

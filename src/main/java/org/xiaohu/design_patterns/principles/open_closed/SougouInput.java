package org.xiaohu.design_patterns.principles.open_closed;

/**
 * @Author xiaohu
 * @Date 2024/10/31 15:31
 * @PackageName:org.xiaohu.design_patterns.principles.open_closed
 * @ClassName: SougouInput
 * @Description: 搜狗输入法
 * @Version 1.0
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}

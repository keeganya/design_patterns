package org.xiaohu.design_patterns.principles.open_closed;

/**
 * @Author xiaohu
 * @Date 2024/10/31 15:34
 * @PackageName:org.xiaohu.design_patterns.principles.open_closed
 * @ClassName: Client
 * @Description: 开闭原则
 *                对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，
 *                实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 2.创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
        // 3.设置输入法皮肤
        input.setSkin(skin);
        // 4.显示皮肤
        input.display();
    }
}

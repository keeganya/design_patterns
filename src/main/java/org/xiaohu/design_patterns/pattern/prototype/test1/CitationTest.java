package org.xiaohu.design_patterns.pattern.prototype.test1;

/**
 * @Author xiaohu
 * @Date 2024/11/6 15:10
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.test1
 * @ClassName: CitationTest
 * @Description: TODO
 * @Version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1.创建原型对象
        Citation c1 = new Citation();
        c1.setName("张三");

        // 复制奖状
        Citation c2 = c1.clone();
        // 将奖状的名字修改为李四
        c2.setName("李四");

        c1.show();

        c2.show();

    }
}

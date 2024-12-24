package org.xiaohu.design_patterns.pattern.prototype.test2;

/**
 * @Author xiaohu
 * @Date 2024/11/7 14:24
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.test2
 * @ClassName: CitationTest
 * @Description: TODO
 * @Version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1.创建原型对象
        Citation citation = new Citation();

        // 2.创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");

        // 3.学生对象赋给奖状
        citation.setStu(stu);

        // 4.创建克隆对象
        Citation citation1 = citation.clone();

        // 5.创建李四学生
        /* 浅克隆（cloneable接口是浅克隆），非基本类型的属性仍指向【原有属性】所指向的对象的内存地址。
           修改名字为李四，其实是修改的同一个地址的属性，就是把原属性给改掉了
        * */
        citation1.getStu().setName("李四");


        // 调用show方法展示
        /* 李四同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！
           李四同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！
        * */
        citation.show();
        citation1.show();
    }
}

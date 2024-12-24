package org.xiaohu.design_patterns.pattern.prototype.deepClone;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author xiaohu
 * @Date 2024/11/7 15:28
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.deepClone
 * @ClassName: CitationTest
 * @Description: TODO
 * @Version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {
        // 1.创建原型对象
        Citation citation = new Citation();
        // 2.创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        // 创建对象输出流对象(序列化)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流对象（反序列化）
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\a.txt"));
        // 读取对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        citation.show();
        citation1.show();
    }
}

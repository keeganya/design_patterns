package org.xiaohu.design_patterns.pattern.singleton.breakSingleton.bySerializable;

import java.io.*;

/**
 * @Author xiaohu
 * @Date 2024/11/4 16:58
 * @PackageName:org.xiaohu.design_patterns.pattern.singleton.breakSingleton.bySerializable
 * @ClassName: Client
 * @Description: 序列化破坏单列 （两次readObjectFromFile()方法生成的对象不同）
 *               解决方案：在Singleton类中添加readResolve() 方法，在反序列化时被自动反射调用，
 *               如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 从文件读取数据
    public static void readObjectFromFile() throws Exception {
        // 1.创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\a.txt"));
        // 2.读取对象
        Object instance = ois.readObject();

        System.out.println(instance);
        // 3.释放资源
        ois.close();
    }

    // 向文件中写数据
    public static void writeObject2File() throws Exception {
        // 1.获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2.创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\a.txt"));
        // 3.写对象
        oos.writeObject(instance);
        // 4.释放资源
        oos.close();
    }
}

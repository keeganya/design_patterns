package org.xiaohu.design_patterns.pattern.factory.configFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @Author xiaohu
 * @Date 2024/11/6 10:10
 * @PackageName:org.xiaohu.design_patterns.pattern.factory.configFactory
 * @ClassName: CoffeeFactory
 * @Description: 通过工厂模式 + 配置文件的方式解除工厂对象和产品对象的耦合
 *               在工厂类中加载配置文件中的全类名，并创建对象进行存储，客户端如果需要对象，直接获取即可
 * @Version 1.0
 */
public class CoffeeFactory {
    // 加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    // 1.定义容器对象存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();

    // 2.加载配置文件，只需要加载一次
    static {
        // 2.1 创建 properties 对象
        Properties p = new Properties();

        // 2.2 调用p对象中的load方法进行配置文件加载
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        try {
            p.load(inputStream);
            // 从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();// {american,latte}
            for (Object key : keys) {
                String className = p.getProperty(((String) key));
                // 通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将名称和对象存储到容器中
                map.put(((String) key),coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 根据名称获取对象
    public static Coffee createCoffe(String name) {
        return map.get(name);
    }
}

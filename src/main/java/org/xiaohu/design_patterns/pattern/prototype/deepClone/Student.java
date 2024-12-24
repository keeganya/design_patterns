package org.xiaohu.design_patterns.pattern.prototype.deepClone;

import java.io.Serializable;

/**
 * @Author xiaohu
 * @Date 2024/11/7 15:27
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.deepClone
 * @ClassName: Student
 * @Description: 学生类
 * @Version 1.0
 */
public class Student implements Serializable {
    // 学生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

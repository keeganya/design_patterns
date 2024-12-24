package org.xiaohu.design_patterns.pattern.prototype.test2;

/**
 * @Author xiaohu
 * @Date 2024/11/7 14:20
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.test2
 * @ClassName: Student
 * @Description: 学生类
 * @Version 1.0
 */
public class Student {
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

package org.xiaohu.design_patterns.pattern.prototype.deepClone;


import java.io.Serializable;

/**
 * @Author xiaohu
 * @Date 2024/11/7 15:26
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.deepClone
 * @ClassName: Citation
 * @Description: 奖状类
 * @Version 1.0
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return ((Citation) super.clone());
    }
    public void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}

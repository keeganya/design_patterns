package org.xiaohu.design_patterns.pattern.prototype.test1;

/**
 * @Author xiaohu
 * @Date 2024/11/6 14:47
 * @PackageName:org.xiaohu.design_patterns.pattern.prototype.test1
 * @ClassName: Citation
 * @Description: TODO
 * @Version 1.0
 */
public class Citation implements Cloneable {
    // 三好学生上的姓名
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return ((Citation) super.clone());
    }

    public void show(){
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}

package org.xiaohu.design_patterns.pattern.builder.demo2;

/**
 * @Author xiaohu
 * @Date 2024/11/7 16:38
 * @PackageName:org.xiaohu.design_patterns.pattern.builder.demo2
 * @ClassName: Phone
 * @Description: 手机类
 * @Version 1.0
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    // 私有构造方法
    public Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;  // 返回当前实例对象
        }
        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        // 使用构建者创建phone对象
        public Phone build() {
            return new Phone(this);
        }
    }

}

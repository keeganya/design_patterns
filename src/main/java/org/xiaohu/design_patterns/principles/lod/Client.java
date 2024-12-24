package org.xiaohu.design_patterns.principles.lod;

/**
 * @Author xiaohu
 * @Date 2024/11/1 17:11
 * @PackageName:org.xiaohu.design_patterns.principles.lod
 * @ClassName: Client
 * @Description: 【迪米特法则（又叫最少知识原则）】 如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。
 *                           其目的是降低类之间的耦合度，提高模块的相对独立性。
 *                           只和你的直接朋友交谈，不跟“陌生人”说话
 *                           “朋友”是指：当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等，
 *                           这些对象同当前对象存在关联、聚合或组合关系，可以直接访问这些对象的方法。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人对象
        Agent agent = new Agent();

        // 创建明星对象
        Star star = new Star("朴宝英");
        agent.setStar(star);

        // 创建粉丝对象
        Fans fans = new Fans("xiaohu");
        agent.setFans(fans);

        // 创建电影公司对象
        Company company = new Company("华谊兄弟");
        agent.setCompany(company);

        // 和粉丝见面
        agent.meeting();
        // 和电影公司洽谈
        agent.business();
    }
}

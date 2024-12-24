package org.xiaohu.design_patterns.principles.isp.before;

/**
 * @Author xiaohu
 * @Date 2024/11/1 16:30
 * @PackageName:org.xiaohu.design_patterns.principles.isp.before
 * @ClassName: SafetyDoor
 * @Description: TODO
 * @Version 1.0
 */
public interface SafetyDoor {
    // 防盗
    void antiTheft();
    // 防火
    void fireProof();
    // 防水
    void waterProof();
}

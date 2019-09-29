package com.lzy.abstractfactorypattern;

/**
 * @author luozuyi
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     * @param color 字符串
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     * @param shape 字符串
     * @return
     */
    public abstract Shape getShape(String shape) ;
}

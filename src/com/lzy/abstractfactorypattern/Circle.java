package com.lzy.abstractfactorypattern;

/**
 * @author luozuyi
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

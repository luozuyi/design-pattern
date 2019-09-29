package com.lzy.abstractfactorypattern;

/**
 * @author luozuyi
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

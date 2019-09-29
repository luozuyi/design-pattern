package com.lzy.abstractfactorypattern;

/**
 * @author luozuyi
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

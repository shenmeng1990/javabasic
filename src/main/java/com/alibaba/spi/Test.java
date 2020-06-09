package com.alibaba.spi;

import java.util.ServiceLoader;

/**
 * @Author shenmeng
 * @Date 2020/6/9
 **/
public class Test {

    public static void main(String[] args) {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        for (Animal animal : animals) {
            animal.shout();
        }
    }
}

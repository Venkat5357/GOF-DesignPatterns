package com.practise.designpatterns.creational.factory;

public class Circle implements  ShapeInterface {
    @Override
    public void draw() {

        System.out.println("Inside Circle::draw() method.");
    }
}

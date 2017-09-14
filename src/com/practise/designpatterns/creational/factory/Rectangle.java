package com.practise.designpatterns.creational.factory;

public class Rectangle implements ShapeInterface {
    @Override
    public void draw() {

        System.out.println("Inside Rectangle::draw() method.");
    }
}

package com.practise.designpatterns.structural.decorator;

public class Main {

    public static void main(String args[]){

        Sandwich sandwich = new DressingSandwichDecorator(new MeatSandwichDecorator(new SimpleSandwich()));

        System.out.println("Sandwich ----- " + sandwich.make());
    }
}

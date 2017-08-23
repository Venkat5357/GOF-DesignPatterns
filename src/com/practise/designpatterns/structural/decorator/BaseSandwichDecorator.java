package com.practise.designpatterns.structural.decorator;

public abstract class BaseSandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public BaseSandwichDecorator(Sandwich customSandwich){

        this.customSandwich = customSandwich;
    }

    public String make(){

        return  customSandwich.make();
    }
}

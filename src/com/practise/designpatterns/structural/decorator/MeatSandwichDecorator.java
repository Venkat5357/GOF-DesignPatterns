package com.practise.designpatterns.structural.decorator;

public class MeatSandwichDecorator extends BaseSandwichDecorator {

    public MeatSandwichDecorator(Sandwich customSandwich){
        super(customSandwich);
    }

    public String make(){

        return  customSandwich.make() + addMeat();
    }


    public String addMeat(){

        return "Turkey";
    }
}

package com.practise.designpatterns.structural.decorator;

public class DressingSandwichDecorator extends BaseSandwichDecorator {


    public DressingSandwichDecorator(Sandwich customSandwich){
        super(customSandwich);
    }

    public String make(){

        return  customSandwich.make() + addDressing();
    }


    public String addDressing(){

        return "Mayo";
    }
}

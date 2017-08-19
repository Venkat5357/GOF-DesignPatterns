package com.practise.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String args[]){

        CreditCardFactory abstractFactory = CreditCardFactory.getCardFactory("Visa");

        CreditCard card = abstractFactory.getCreditCard("BOFA");

        System.out.println("------>" + card.getClass());
        }

}

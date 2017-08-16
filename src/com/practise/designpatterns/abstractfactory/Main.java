package com.practise.designpatterns.abstractfactory;

public class Main {

    public static void main(String args[]){

        CreditCardFactory abstractFactory = CreditCardFactory.getCardFactory("Visa");

        CreditCard card = abstractFactory.getCreditCard("BOFA");

        System.out.println("------>" + card.getClass());
        }

}

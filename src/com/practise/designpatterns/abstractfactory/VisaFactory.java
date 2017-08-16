package com.practise.designpatterns.abstractfactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(String name) {

        switch (name){

            case "BOFA":

                return new BankofAmericaVisa();

            case "Chase":

                return new ChaseFreedomVisa();

            default:
                break;
        }

        return null;
    }
}

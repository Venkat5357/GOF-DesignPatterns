package com.practise.designpatterns.creational.abstractfactory;

public class MasterCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(String name) {

             switch (name){

                case "Citi":

                    return new CitiMaster();

                case "CaptialOne":

                    return new CapitalOneMaster();

                default:
                    break;
            }

            return null;

    }
}

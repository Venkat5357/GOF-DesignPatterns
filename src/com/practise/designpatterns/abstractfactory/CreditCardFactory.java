package com.practise.designpatterns.abstractfactory;

public abstract class CreditCardFactory {

        public static CreditCardFactory getCardFactory(String type){

            if(type == "Master"){
                return new MasterCardFactory();
            } else if (type == "Visa"){
                return new VisaFactory();
            }else{

                return null;
            }

        }


        public abstract CreditCard getCreditCard(String name);


}

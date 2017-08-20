package com.practise.designpatterns.structural.facade;

public class Main {

    public static void main(String args[]){

        ClientController controller = new ClientController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(1);

        boolean result = controller.orderFulfilled;

        System.out.println("-------->" + result);
    }
}

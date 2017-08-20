package com.practise.designpatterns.structural.facade;

public class ClientController {

    public OrderServiceFacade facade;
    boolean orderFulfilled=false;

    public void orderProduct(int productId) {
        orderFulfilled=facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}


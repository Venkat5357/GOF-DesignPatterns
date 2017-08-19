package com.practise.designpatterns.structural.adapter;

public class Main {

    public static void main(String args[]){

        EmployeeClient client = new EmployeeClient();


        System.out.println(client.getEmployeeList().size());


    }
}

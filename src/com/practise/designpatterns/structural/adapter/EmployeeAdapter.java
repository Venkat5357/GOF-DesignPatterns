package com.practise.designpatterns.structural.adapter;

public class EmployeeAdapter implements  Employee{

    private EmployeeLDAP employeeLDAP;

    public EmployeeAdapter(EmployeeLDAP employeeLDAP){

        this.employeeLDAP = employeeLDAP;

    }

    @Override
    public String getId() {
        return employeeLDAP.getCid();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getfName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getlName();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getEmailAddress();
    }
}

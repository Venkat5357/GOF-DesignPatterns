package com.practise.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employeeList = new ArrayList<Employee>();

        NewEmployeeDB newEmployeeDB = new NewEmployeeDB("1","Venkatesh","Marupudi","venkat5@gmail.com");

        EmployeeLDAP employeeLDAP =  new EmployeeLDAP("2","pavan","thouguru","pavant@gmail.com");

        employeeList.add(newEmployeeDB);

        employeeList.add(new EmployeeAdapter(employeeLDAP));

        return employeeList;

    }
}

package com.pluralsight;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = ReadFiles.readEmployeeCSV("employees.csv");

        displayListOfEmployeesAndDetails(employeeList);



    }

    public static void displayListOfEmployeesAndDetails(List<Employee> _employees){
        System.out.println("\n--Employees And Details--\n");
        for (Employee e : _employees){
            System.out.println("=======================");
            e.displayEmployeeInfo();
        }
        System.out.println("=======================");
    }
}
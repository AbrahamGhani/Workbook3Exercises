package com.pluralsight;

import java.util.*;
import java.io.*;
public class Main {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


//        List<Employee> employeeList = ReadFiles.readEmployeeCSV("employees.csv");
//
//        displayListOfEmployeesAndDetails(employeeList);
//

        try {
            System.out.println("Enter name of file to process: ");
            String fileToProcess = scanner.nextLine();
            System.out.println("Enter name of file to write into: ");
            String fileToWrite = scanner.nextLine();

            List<Employee> newEmployeeList = ReadFiles.readEmployeeCSV(fileToProcess);

            WriteIntoFiles.writeEmployeeListIntoNewFile(fileToWrite,newEmployeeList);
        }catch (Exception e){
            System.out.println("ERROR");
        }




    }



}
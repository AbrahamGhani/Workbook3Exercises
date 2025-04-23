package com.pluralsight;

import java.util.*;
import java.io.*;
public class Main {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


   //     List<Employee> employeeList = ReadFiles.readEmployeeCSV("employees.csv");

   //     displayListOfEmployeesAndDetails(employeeList);


        try {
            System.out.println("Enter name of file to process: ");
            String fileToProcess = scanner.nextLine();
            System.out.println("Enter name of file to write into: ");
            String fileToWrite = scanner.nextLine();

            List<Employee> newEmployeeList = ReadFiles.readEmployeeCSV(fileToProcess);

            FileWriter fileWriter = new FileWriter(fileToWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;


            for (Employee e : newEmployeeList){
                line = e.getEmployeeID() + "|" + e.getName() + "|" + e.getHoursWorked() + "|" + e.getPayRate();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();


        }catch (IOException e){
            System.out.println("ERROR");
        }


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
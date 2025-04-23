package com.pluralsight;
import java.io.*;
import java.util.*;

public class ReadFiles {

    public static List<Employee> readEmployeeCSV(String _filename){
        List<Employee> employees = new ArrayList<>();
       try {
           FileReader fileReader = new FileReader(_filename);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           bufferedReader.readLine();
           String line;
           while ((line = bufferedReader.readLine()) != null){
               String[]employeeDetails = line.split("\\|");
               if (employeeDetails.length ==4) {
                   int id = Integer.parseInt(employeeDetails[0]);
                   String name = employeeDetails[1];
                   double hourWorked = Double.parseDouble(employeeDetails[2]);
                   double payRate = Double.parseDouble(employeeDetails[3]);

                   Employee e = new Employee(id, name, hourWorked, payRate);

                   employees.add(e);
               }
           }

       }  catch (IOException e) {
           System.out.println("IOexeption");
       }
       return employees;

    }



}

package com.pluralsight;
import java.io.*;
import java.util.*;

public class WriteIntoFiles {


/*
example i got from my dad
NOTE TO SELF -- improve method to maybe prompt user for details and use that to write the file like i have in the main method
 */

public static void writeEmployeeListIntoNewFile(String _filename, List<Employee> _employees){

    try {
        FileWriter fileWriter = new FileWriter(_filename);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        for (Employee e : _employees){
            line = e.getEmployeeID() + "|" + e.getName() + "|" + e.getHoursWorked() + "|" + e.getPayRate();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Contents Written into new file");
    }catch (IOException e){
        System.out.println("IOException");
    }








//              //Example I am referencing
//    try {
//        // create a FileWriter
//        FileWriter fileWriter = new FileWriter("text.txt");
//        // create a BufferedWriter
//        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
//        // write to the file
//        String text;
//        for(int i = 1; i <= 10; i++) {
//            text = String.format("Counting %d\n", i);
//            bufWriter.write(text);
//        }
//        // close the writer
//        bufWriter.close();
//    }
//    catch (IOException e) {
//        System.out.println("ERROR: An unexpected error occurred");
//        e.getStackTrace();
//    }
}


}

package com.pluralsight.EmployeeClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFileManager {
    private static String filName = "EmployeeInventory.csv";

    public static String saveEmployee(Employee employee){
        if (employee == null){
            return "Employeee is empty";
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter (filName, true))){
            String employeeData = String.format("%s|%d|%s", employee.getName (), employee.getYearOfExperience (), employee.getJobTitle ());
            bufferedWriter.write(employeeData);
            bufferedWriter.newLine();
            return "Employee is added";
        }catch (Exception e){
            e.printStackTrace ();
            return "An error accured";
        }
    }

    public static String removeEmployee(String employeeName){
        List<String> employees = new ArrayList<> ();
        boolean nameFound = false;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filName))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                if(!line.contains(employeeName)){
                    employees.add(line);
                }else{
                    nameFound = true;
                }
            }
        }catch(Exception e){
            e.printStackTrace ();
            return "There was an error";
        }

        if(!nameFound){
            return "Employee name was not found";
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filName))){
            for(String employee : employees){
                bufferedWriter.write(employee);
                bufferedWriter.newLine();
            }
            return "Employee Added";
        }catch(Exception e){
            e.printStackTrace();
            return "Error adding Employee";
        }
    }
}

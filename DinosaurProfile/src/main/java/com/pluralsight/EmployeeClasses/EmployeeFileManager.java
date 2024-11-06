package com.pluralsight.EmployeeClasses;

import com.pluralsight.DinosaurClasses.Dinosaur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFileManager {
    private static String employeeFilName = "EmployeeInventory.csv";
    private static String dinosaurFileName = "inventory.csv";

    public static String saveEmployee(Employee employee){
        if (employee == null){
            return "Employeee is empty";
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter (employeeFilName, true))){
            String employeeData = String.format("%s|%d|%s", employee.getName (), employee.getYearOfExperience (), employee.getJobTitle ());
            bufferedWriter.write(employeeData);
            bufferedWriter.newLine();
            return "Employee is Removed successfully";
        }catch (Exception e){
            e.printStackTrace ();
            return "An error accused";
        }
    }

    public static String removeEmployee(String employeeName){
        List<String> employees = new ArrayList<> ();
        boolean nameFound = false;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(employeeFilName))){
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

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(employeeFilName))){
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

    public static String addDinosaur(Dinosaur dinosaur, String authKey){
        if(dinosaur == null){
            return "Your entry is empty";
        }

        if(!verifyEmployee(authKey)){
            return "You are not authorized to add a dinosaur.";
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dinosaurFileName, true))){
            String dinosaurData = String.format("%s|%d|%s|%s|%.2f\n", dinosaur.getName(), dinosaur.getAge(), dinosaur.getSpecies(), dinosaur.getDiet(), dinosaur.getWeight());
            bufferedWriter.write(dinosaurData);
            return "dinosaur added Successfully!";
        }catch(Exception e){
            e.printStackTrace ();
            return "Error saving dinosaur";
        }
    }

    public static boolean verifyEmployee(String authKey){
        boolean employeeVerified = false;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("AuthorizedEmployee.csv"))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                if(line.equalsIgnoreCase(authKey)){
                    employeeVerified = true;
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return employeeVerified;
    }
}

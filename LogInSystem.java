/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class LogInSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("LogIN System");
        
        //~~Registration~~
        System.out.println("\n~~Registration~~");
        
        //First name and surname formating
        System.out.println("Enter First name:");
        String name = input.nextLine();
        
       System.out.println("Enter Last name:");
        String lastName = input.nextLine(); 
        
        //username and formating
        boolean checkUsername = false;
        String username = "";
        while (!checkUsername){
            
        System.out.println("Username must contain the following:");
        System.out.println("Username must contain five characters and a underscore");
        
        System.out.println("Enter Username:");
        username = input.nextLine();
        
        checkUsername = username.length() >= 5&& username.contains("_");
        
        if (checkUsername){
            System.out.println("Username successfully captured:");
            
        }else {
           System.out.println("Username is not correctly formatted, make sure that username has a underscore and is five characters long:");
        } 
        }
        
        // Password and conditions
        
        boolean checkPasswordComplexity = false;
String pasword = "";

while (!checkPasswordComplexity) {

    System.out.println("Password must contain a capital letter, a number, a special character and be at least 8 characters long");
    System.out.println("Enter Password:");
    pasword = input.nextLine();

    if (checkPasswordComplexity(pasword)) {
        System.out.println("Password successfully captured.");
        checkPasswordComplexity = true; 
    } else {
        System.out.println("Password is not correctly formatted, try again.");
    }
}
        // Phone number and conditions
        System.out.println("Enter Cell Phone Number:");
        String cellnumber = input.nextLine();
        
         if (checkPhoneNumber(cellnumber)) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            return;
        }
         // ~~~LOGIN ~~~
System.out.println("\n~~~ Login ~~~~");

boolean loggedIn = false;

while (!loggedIn) {
    System.out.println("Enter Username:"); //username and condition with loops and if
    String loginUser = input.nextLine();

    System.out.println("Enter Password:");
    String loginPass = input.nextLine();

    if (loginUser.equals(username) && loginPass.equals(pasword)) {
        System.out.println("Login successful, Welcome back " + name + " " + lastName);
        loggedIn = true;
    } else {
        System.out.println("Incorrect username or password. Try again.");
    }
}
        }// Password boolean conditions
        public static boolean checkPasswordComplexity(String pasword) {
        if (pasword.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < pasword.length(); i++) {
            char ch = pasword.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasUppercase && hasNumber && hasSpecial;
        }
//Phone number boolean Conditions
        
        public static boolean checkPhoneNumber(String cellnumber) {
        String pattern = "^\\+\\d{1,3}\\d{9,10}$";
        return cellnumber.matches(pattern);
        }
}




        
    
   
    


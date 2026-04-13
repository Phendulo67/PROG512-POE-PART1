/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class LogInSystemIT {
    
    public LogInSystemIT() {
    }
    
   

    /**
     * Test of main method, of class LogInSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LogInSystem.main(args);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class LogInSystem.
     */
    @Test
    public void testcheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String pasword = "kyle!!!!!";
        boolean expResult = false;
        boolean result = LogInSystem.checkPasswordComplexity(pasword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkPhoneNumber method, of class LogInSystem.
     */
    @Test
    public void testcheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String cellnumber = "+27838968976";
        boolean expResult = true;
        boolean result = LogInSystem.checkPhoneNumber(cellnumber);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkPasswordComplexity method, of class LogInSystem.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String pasword = "Ch&&sec@ke99";
        boolean expResult = true;
        boolean result = LogInSystem.checkPasswordComplexity(pasword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPhoneNumber method, of class LogInSystem.
     */
    @Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String cellnumber = "08966553";
        boolean expResult = false;
        boolean result = LogInSystem.checkPhoneNumber(cellnumber);
        assertEquals(expResult, result);
        
    }
    
}

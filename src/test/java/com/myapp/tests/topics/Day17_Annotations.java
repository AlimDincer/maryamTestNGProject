package com.myapp.tests.topics;

import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.*;

public class Day17_Annotations {

   @BeforeSuite
  public void beforeSuite(){
       System.out.println("Before suite");
   }
   @AfterSuite
   public void afterSuite(){
       System.out.println("After suite");
   }
   @BeforeClass
   public void beforeClass(){
       System.out.println("Before Class");
   }
   @AfterClass
   public void afterClass(){
       System.out.println("After class");
   } @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
    @Test
    public void tes1(){
        System.out.println("Test 1");
    }
    @Test
    public void tes2(){
        System.out.println("Test 2");
    }
    @Test
    public void tes3(){
        System.out.println("Test 3");
    }
    @Test
    public void tes4(){
        System.out.println("Test 4");
    }
    @Test
    public void tes5(){
        System.out.println("Test 5");
    }

}

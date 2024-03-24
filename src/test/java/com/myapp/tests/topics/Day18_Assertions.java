package com.myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day18_Assertions {
  @Test
  public void hardAssertio(){
      System.out.println("1");
      Assert.assertTrue(true);
      System.out.println("2");
      Assert.assertEquals(3,5);
      System.out.println("3");
    }
    @ Test
    public void softAssertion(){
        System.out.println("A");
        SoftAssert sf= new SoftAssert();
        sf.assertEquals(3,5);
        System.out.println("B");
        sf.assertAll("Test is failed");
        System.out.println("D");// it does not execute
    }
}

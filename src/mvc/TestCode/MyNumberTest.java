/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.TestCode;

import mvc.TestCode.*;
import TestCode.MyNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akash
 */
public class MyNumberTest {
    
    private MyNumber number1, number2; // Test fixtures
 
   @Before
   public void setUp() throws Exception {
      System.out.println("Run @Before"); 
      number1 = new MyNumber(11);
      number2 = new MyNumber(22);
      
   }
 
   @After
   public void tearDown() throws Exception {
      System.out.println("Run @After"); // for illustration
   }
 
   @Test
   public void testGetterSetter() {
      System.out.println("Run @Test testGetterSetter"); // for illustration
      int value = 33;
      number1.setNumber(value);
      assertEquals( value, number1.getNumber());
   }
 
   @Test
   public void testAdd() {
      System.out.println("Run @Test testAdd"); 
      assertEquals( 33, number1.add(number2).getNumber());
     
   }
    @Test
   public void testsub() {
      System.out.println("Run @Test testAdd"); 
      assertEquals( -11, number1.sub(number2).getNumber());
     
   }
 
   @Test
   public void testDiv() {
      System.out.println("Run @Test testDiv");
      assertEquals( 2, number2.div(number1).getNumber());
      
   }
    @Test
   public void testmul() {
      System.out.println("Run @Test testDiv");
      assertEquals( 242, number2.mul(number1).getNumber());
      
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testDivByZero() {
      
      number2.setNumber(0);
      number1.div(number2);
   }
}
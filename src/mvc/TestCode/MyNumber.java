package TestCode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *

 */
public class MyNumber {
    int number;
    
   public MyNumber(int number) {
      this.number = number;
   }
 
   // Getter and setter
   public int getNumber() {
      return number;
   }
 
   public void setNumber(int number) {
      this.number = number;
   }
 
   // Public methods
   public MyNumber add(MyNumber rhs) {
      this.number += rhs.number;
      return this;
   }
    public MyNumber sub(MyNumber rhs) {
      this.number -= rhs.number;
      return this;
   }
     public MyNumber mul(MyNumber rhs) {
      if (rhs.number == 0) throw new IllegalArgumentException("Cannot divide by 0!");
      this.number *= rhs.number;
      return this;
   }
 
   public MyNumber div(MyNumber rhs) {
      if (rhs.number == 0) throw new IllegalArgumentException("Cannot divide by 0!");
      this.number /= rhs.number;
      return this;
   }
}
    


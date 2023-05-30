package com.assignment.calculator.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  
  @Test
  public void testSum() {
   testsubtract(); int result = Calculator.sum(2, 3);
    assertEquals(5, result);
  }
  
  @Test
  public void testSumWithNegativeNumbers() {
    int result = Calculator.sum(-5, 10);
    assertEquals(5, result);
  }
  @Test
  public void testmultiply() {
	    int result = Calculator.multiply(5,5 );
	    assertEquals(25, result);
  }

@Test
public void testsubtract(){
int result=Calculator.subtract(10,3);
assertEquals(7, result);
}

@Test
public void testdivide() {
	int result=Calculator.divide(10, 5);
	assertEquals(2,result);
}

}

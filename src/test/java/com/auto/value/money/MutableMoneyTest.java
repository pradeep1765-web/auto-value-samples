package com.auto.value.money;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
  
  public class MutableMoneyTest {
  
  @Test 
  public void testEquality() {
  
	  MutableMoney m1 = new MutableMoney("USD",10000); 
	  MutableMoney m2 = new MutableMoney("USD",10000); 
	  assertFalse(m1.equals(m2));  
  } 
}
 
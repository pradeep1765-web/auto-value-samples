
  package com.auto.value.money;
  
  import static org.junit.Assert.assertTrue;
  
  import org.junit.Test;
  
  public class AutoValueMoneyTest {
  
  @Test 
  public void testEquality() {
  
	  AutoValueMoney m1 = AutoValueMoney.create("USD", 5000); 
	  AutoValueMoney m2 = AutoValueMoney.create("USD", 5000); 
	  assertTrue(m1.equals(m2)); 
	  } 
  }
 
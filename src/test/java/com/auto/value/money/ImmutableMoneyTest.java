
  package com.auto.value.money;
  
  import static org.junit.Assert.assertTrue;
  
  import org.junit.Test;
  
  public class ImmutableMoneyTest {
  
  @Test 
  public void testEquality() { 
	  ImmutableMoney m1 = new ImmutableMoney("USD", 10000); 
	  ImmutableMoney m2 = new ImmutableMoney("USD",10000); 
	  assertTrue(m1.equals(m2)); 
  }
  
 }
 
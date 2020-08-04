package com.auto.value.money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutoValueMoneyWithBuilderTest {

	@Test
	public void testBuilder() {
		
		AutoValueMoneyWithBuilder autoValue = AutoValueMoneyWithBuilder
				.builder().setCurrency("USD")
				.setAmount(1000)
				.build();
		
		assertEquals(1000, autoValue.getAmount());
		assertEquals("USD",autoValue.getCurrency());
				
	}
}

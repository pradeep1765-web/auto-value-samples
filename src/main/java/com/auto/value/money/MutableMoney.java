package com.auto.value.money;

public class MutableMoney {
	
	private String currency;
	private long amount;
	
	public MutableMoney(String currency,long amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	

}

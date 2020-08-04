
package com.auto.value.money;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AutoValueMoneyWithBuilder extends AutoValueMoneyWithBuilder {

  private final String currency;
  private final long amount;

  private AutoValue_AutoValueMoneyWithBuilder(
      String currency,
      long amount) {
    if (currency == null) {
      throw new NullPointerException("Null currency");
    }
    this.currency = currency;
    this.amount = amount;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

  @Override
  public long getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "AutoValueMoneyWithBuilder{"
        + "currency=" + currency + ", "
        + "amount=" + amount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoValueMoneyWithBuilder) {
      AutoValueMoneyWithBuilder that = (AutoValueMoneyWithBuilder) o;
      return (this.currency.equals(that.getCurrency()))
           && (this.amount == that.getAmount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.currency.hashCode();
    h *= 1000003;
    h ^= (this.amount >>> 32) ^ this.amount;
    return h;
  }

  static final class Builder extends AutoValueMoneyWithBuilder.Builder {
    private String currency;
    private Long amount;
    Builder() {
    }
    Builder(AutoValueMoneyWithBuilder source) {
      this.currency = source.getCurrency();
      this.amount = source.getAmount();
    }
    @Override
    public AutoValueMoneyWithBuilder.Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }
    @Override
    public AutoValueMoneyWithBuilder.Builder setAmount(long amount) {
      this.amount = amount;
      return this;
    }
    @Override
    public AutoValueMoneyWithBuilder build() {
      String missing = "";
      if (currency == null) {
        missing += " currency";
      }
      if (amount == null) {
        missing += " amount";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AutoValueMoneyWithBuilder(
          this.currency,
          this.amount);
    }
  }

}

package com.baeldung;

public class Money {

    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof Money))
            return false;
        Money other = (Money)obj;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null) || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));

        return this.amount == other.amount && currencyCodeEquals;
    }
}

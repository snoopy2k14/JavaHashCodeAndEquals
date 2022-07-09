package com.baeldung;

public class WrongVoucher extends Money{

    private String store;

    public WrongVoucher(int amount, String currencyCode, String store) {
        super(amount, currencyCode);
        this.store = store;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof WrongVoucher))
            return false;

        WrongVoucher other = (WrongVoucher) obj;

        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
        || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));

        boolean storeEquals = (this.store == null && other.store == null)
            || (this.store != null && this.store.equals(other.store));

        return this.amount == other.amount && currencyCodeEquals && storeEquals;

        }


}


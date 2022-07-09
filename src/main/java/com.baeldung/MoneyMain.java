package com.baeldung;

public class MoneyMain {

    public static void main(String[] args) {

  /*      Money income = new Money(55,"USD");
        Money expenses = new Money(55,"USD");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);*/

 /*       Money cash = new Money(42, "USD");
        WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");

        System.out.println(voucher.equals(cash));
        System.out.println(cash.equals(voucher));*/

        Money cash = new Money(42, "USD");
        Voucher voucher = new Voucher(42, "USD", "Amazon");

        System.out.println(voucher.equals(cash));
        System.out.println(cash.equals(voucher));


    }
}

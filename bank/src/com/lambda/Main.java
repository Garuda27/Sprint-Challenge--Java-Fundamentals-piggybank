package com.lambda;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {



    public static void main(String[] args){
            ArrayList<Money> bank = new ArrayList<>();
            DecimalFormat fp = new DecimalFormat("$###,###.00");
            double bankValue = 0;

            bank.add(new Quarter(1));
            bank.add(new Dime(1));
            bank.add(new Dollar(5));
            bank.add(new Nickel(3));
            bank.add(new Dime(7));
            bank.add(new Dollar(1));
            bank.add(new Penny(10));

            bank.forEach(worth -> System.out.println(worth.stringValue()));

            for (Money m : bank){
                bankValue = bankValue + m.getValue();
            }

            System.out.println("The piggy bank holds " + fp.format(bankValue));
    }
}

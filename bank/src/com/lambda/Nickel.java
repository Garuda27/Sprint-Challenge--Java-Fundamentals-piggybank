package com.lambda;

public class Nickel extends Money{
    public Nickel(int count){
        super(count);
        value = 0.05;
    }

    @Override
    public String stringValue(){
        return "Nickels: " + count;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

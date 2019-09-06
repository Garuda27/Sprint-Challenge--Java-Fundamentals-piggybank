package com.lambda;

public class Penny extends Money{
    public Penny(int count){
        super(count);
        value = 0.01;
    }

    @Override
    public String stringValue(){
        return "Pennies: " + count;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

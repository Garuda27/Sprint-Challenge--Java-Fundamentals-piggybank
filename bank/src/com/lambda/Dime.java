package com.lambda;

public class Dime extends Money{
    public Dime(int count){
        super(count);
        value = 0.1;
    }

    @Override
    public String stringValue(){
        return "Dimes: " + count;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

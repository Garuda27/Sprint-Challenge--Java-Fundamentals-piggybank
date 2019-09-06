package com.lambda;

public class Quarter extends Money{
    public Quarter(int count){
        super(count);
        value = 0.25;
    }

    @Override
    public String stringValue(){
        return "Quarters: " + count;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

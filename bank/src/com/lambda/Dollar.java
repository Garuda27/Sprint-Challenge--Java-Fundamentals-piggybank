package com.lambda;

public class Dollar extends Money{
    public Dollar(int count){
        super(count);
        value = 1;
    }

    @Override
    public String stringValue(){
        return "Dollars: " + count;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

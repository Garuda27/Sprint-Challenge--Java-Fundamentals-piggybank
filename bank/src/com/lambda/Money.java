package com.lambda;

public abstract class Money {
    int count = 1;
    double value;

    public Money(int count){
        this.count = count;
    }

    public double getValue(){
        return value * count;
    }

    public abstract String stringValue();

    @Override
    public String toString(){
        return "Count = " + count + ", Value = " + value + '\n';
    }
}

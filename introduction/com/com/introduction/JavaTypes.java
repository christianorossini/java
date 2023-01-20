package com.introduction;

public class JavaTypes {

    //whole numbers
    private byte byteVar; //8 bits
    private int intVar; //16 bits
    private short shortVar; //32 bits
    private long longVar; //64 bits

    //decimals/fractions
    private float floatVar;
    private double doubleVar;

    public JavaTypes(byte byteVar, int intVar, short shortVar, long longVar, float floatVar, double doubleVar) {
        this.byteVar = byteVar;
        this.intVar = 500_000_000;
        this.shortVar = shortVar;
        this.longVar = longVar;
        this.floatVar = floatVar;
        this.doubleVar = doubleVar;
    }

    public JavaTypes() {
    }

    @Override
    public String toString() {
        return "";
    }

    public void floatingPointsOutputs(){
        double varDouble;
        varDouble = 5;
        System.out.print("5 = " + varDouble + "\n");
        System.out.print("5.000000 = " + 5.000000 + "\n");
        System.out.print("5f = " + 5f + "\n");
        System.out.print("5d = " + 5d + "\n");
        System.out.print("5e1 (5x10¹) = " + 5e1 + "\n");
        System.out.print("5_000_000.0 = " + 5_000_000.0 + "\n");
        System.out.print("50_000_000.0 = " + 5_000_000.0 + "\n");
    }
}


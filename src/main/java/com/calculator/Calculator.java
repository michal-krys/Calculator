package com.calculator;

public class Calculator {

    public int add ( int a, int b){
        return a + b;
    }

    public int subtract ( int a, int b){
       return a - b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.subtract(9, 4));
        System.out.println(calc.add(7, 6));
    }
}
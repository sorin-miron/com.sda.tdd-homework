package com.sda.tdd.homework;

public class Fibonacci {

    private int number;

    private int[] fibonacciSequens;

    public int computeNonRecursive (int index) {
        index--;
        if (index == 0 || index == 1) {
            return index;
        }
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int result = fibonacci1 + fibonacci2;
        int i = 3;
        while(i <= index){
            fibonacci1 = fibonacci2;
            fibonacci2 = result;
            result = fibonacci1 + fibonacci2;
            i++;
        }
        return result;
    }

    public int computeRecursive (int index) {
        if (index == 1 || index == 2) {
            return index-1;
        }
        return computeRecursive(index-1) + computeRecursive(index-2);
    }

}

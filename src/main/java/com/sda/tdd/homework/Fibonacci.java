package com.sda.tdd.homework;

public class Fibonacci {

    private int number;

    private int[] fibonacciSequens;

    public int computeNonRecursive (int index) throws Exception {
        if(index < 0 ){
            throw new Exception("The index must be greater than or equal with zero");
        }
        if (index == 0 || index == 1) {
            return index;
        }
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int result = fibonacci1 + fibonacci2;
        int i = 2;
        while(i < index){
            fibonacci1 = fibonacci2;
            fibonacci2 = result;
            result = fibonacci1 + fibonacci2;
            i++;
        }
        return result;
    }

    public int computeRecursive (int index) throws Exception {
        if(index < 0 ){
            throw new Exception("The index must be greater than or equal with zero");
        }
        if (index == 0 || index == 1) {
            return index;
        }
        return computeRecursive(index-1) + computeRecursive(index-2);
    }

}

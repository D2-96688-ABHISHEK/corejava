package com.sunbeam.q8;

import java.util.stream.IntStream;

class FactorialStream {
    
    // Method to calculate factorial using streams
    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number must be non-negative");

        return IntStream.rangeClosed(1, n)
                        .asLongStream()
                        .reduce(1, (a, b) -> a * b);
    }
}

public class Program {
    public static void main(String[] args) {
        int num = 5;

        long result = FactorialStream.factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}

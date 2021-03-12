package com.knoldus;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class RangeMultiply {

    public static int calculate(String first, String second) {
        LongBinaryOperator instance = (x, y) -> LongStream.rangeClosed(x, y)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(0);
        try {
            int result = (int) instance.applyAsLong(Integer.parseInt(first), Integer.parseInt(second));
            return result;
        }catch(Exception e){
            System.out.println("Please Enter a valid number :"+e);
            throw new NumberFormatException();
        }

    }
}
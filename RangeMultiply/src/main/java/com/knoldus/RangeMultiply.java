package com.knoldus;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class RangeMultiply {

    public static int calculate(int first, int second) {
        LongBinaryOperator instance = (x, y) -> LongStream.rangeClosed(x, y)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(0);
       int result = (int) instance.applyAsLong(first, second);
        return  result;

    }
}
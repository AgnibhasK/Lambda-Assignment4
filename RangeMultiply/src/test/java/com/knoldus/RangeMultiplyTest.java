package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RangeMultiplyTest {

    @Test
    public void RangMultiplicationTest() {
        RangeMultiply instance = new RangeMultiply();
        int result = instance.calculate(0,1);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void RangMultiplicationTest1() {
        RangeMultiply instance = new RangeMultiply();
        int result = instance.calculate(2,2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void RangMultiplicationTest3() {
        RangeMultiply instance = new RangeMultiply();
        int result = instance.calculate(1,9);
        Assertions.assertEquals(362880, result);
    }

}
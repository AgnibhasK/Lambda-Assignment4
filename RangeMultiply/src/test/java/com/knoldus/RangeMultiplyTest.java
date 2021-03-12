package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RangeMultiplyTest {

    @Test
    public void RangMultiplicationTest1() {
        int result = RangeMultiply.calculate("0","1");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void RangMultiplicationTest2() {
        int result = RangeMultiply.calculate("2","2");
        Assertions.assertEquals(2, result);
    }
    @Test
    public void RangMultiplicationTest3() {
        int result = RangeMultiply.calculate("1","9");
        Assertions.assertEquals(362880, result);
    }
    @Test
    public void CheckForException() {
        Assertions.assertThrows(NumberFormatException.class,()->RangeMultiply.calculate("1","Four") );
    }

}
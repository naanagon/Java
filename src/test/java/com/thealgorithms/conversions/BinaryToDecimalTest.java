package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void testBinaryToDecimal() {
        //zeros at the starting should be removed
        assertEquals(0, BinaryToDecimal.binaryToDecimal(0));
        assertEquals(5, BinaryToDecimal.binaryToDecimal(101));
    }
}

package com.rsupak;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static int countOneBits(int number) {
        String bitString = Integer.toBinaryString(number);
        int count = 0;
        for (int i = 0; i < bitString.length(); i++) {
            if (bitString.charAt(i) == '1')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        int number = 10;
        System.out.println(countOneBits(9));
    }
}

package com.hackerrank.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeautifulDaysATtheMovie {

    public static int reverseInteger(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 2000000;
        int divisor = 23047885;

        List<Double> beautifulDays = IntStream.rangeClosed(start, end)
                .mapToObj(i -> (i - reverseInteger(i)) / (double) divisor)
                .collect(Collectors.toList());

        long integerBeautifulDays = beautifulDays.stream()
                .filter(d -> d % 1 == 0)
                .count();

        System.out.println(integerBeautifulDays);
    }
}

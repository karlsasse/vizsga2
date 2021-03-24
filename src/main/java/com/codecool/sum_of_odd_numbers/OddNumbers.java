package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int sumOdds = 0;
        for (int o : numbers) {
            if (o % 2 != 0) {
                sumOdds += o;
            }
        }
        Integer result = new Integer(sumOdds);
        return result;
    }
}
package com.Rx.Example.Stream;

import java.util.List;

public class SumAndReduce {

    public static int calculate(List<Integer> numbers){
        int total = 0;
        for(int number: numbers)
            total+=number;
        return total;
    }

    public static int calculate2(List<Integer> numbers){
        //reduce azaltmak anlamına gelir
        return numbers.stream()
                .reduce((i, sum)-> i+sum)
                .orElse(0);

    }
}

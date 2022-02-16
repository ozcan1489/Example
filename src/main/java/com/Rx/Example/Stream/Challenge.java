package com.Rx.Example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {

    public static void main(String[] args) {
       System.out.println(getString(Arrays.asList(3,44)));
    }
    public static String getString(List<Integer> list) {

        return list.stream()
                .map(i-> {
                            String s = "";
                            if (i % 2 == 0)
                                s += "e" + i;
                            else
                                s += "o" + 1;
                            return s;
                        })
                .collect(Collectors.joining(","));

    }
}

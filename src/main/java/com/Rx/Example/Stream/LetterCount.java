package com.Rx.Example.Stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {

        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("kalem","aıosdıajskdl","asd"));

    }

    /**
     * Take array elements => stream()
     * filter name length longer than 5 => filter()
     * list to Int => mapToInt()
     * sum()
     * @param names
     * @return
     */
    private static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name->name.length()>5)//Stream<String>
                .mapToInt(name->name.length())//Stream<Integer>
                .sum();
    }
}

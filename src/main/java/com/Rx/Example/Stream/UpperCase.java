package com.Rx.Example.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * upperCase given String List
 */
public class UpperCase {

    public static void main(String[] args) {
        System.out.println(mapToUpperCase("a","B","c"));
    }

    private static Collection<String> mapToUpperCase(String... names) {
        return Arrays.stream(names)
                //.map(name->name.toUpperCase())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}

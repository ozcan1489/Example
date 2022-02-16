package com.Rx.Example.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {

    /**
     * Age, under the 18, get names
     * @param people
     * @return
     */
    public static Set<String> getKidNames(List<Person> people){
        return people.stream()
                .filter(n->n.getAge()<18)
                .map(person->person.getName())
                .collect(Collectors.toSet());

    }
}

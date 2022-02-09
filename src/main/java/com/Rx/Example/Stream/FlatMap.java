package com.Rx.Example.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

    }

    public static List<String> transform(List<List<String>> collection){
        List<String> newCollection = new ArrayList<>();
        for(List<String> subCollection : collection){
            for(String value : subCollection)
                newCollection.add(value);
        }
        return newCollection;
    }

    /**
     * {A,B,C} {D,E,F} nested list
     * collection.get(0) => {a,b,c} collection.get(0).get(0) => A
     * -->Take nested list variables; stream()
     * -->Each element adding List and return --> flatMap()
     *
     * @param collection
     * @return
     */
    public static List<String> transform2(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)//Stream<Stream<String>> -> Stream<String>
                .collect(Collectors.toList());//Stream<String> -> List<String>



    }
}

package com.Rx.Example.Optional;

import lombok.val;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    public static final HashMap<String, String> PHONE_NUMBERS = new HashMap<>() {
        {
            put("askdjlk alaks", "016/161616");
            put("deneme2", "016/161617");
            put("deneme3", "016/0161618");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    PhoneBook(){}

    public HashMap<String, String> getPhoneBookEntries(){
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name){
        return Optional.ofNullable(PHONE_NUMBERS.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){
        return PHONE_NUMBERS.entrySet()
                .stream()
                .filter(entry->entry.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    @Override
    public String toString(){
        System.out.println("Hello from PhoneBook's toString Meythod");
        return "PhoneBook{"+
                "phoneBookEntries="+ phoneBookEntries +
                '}';
    }
}

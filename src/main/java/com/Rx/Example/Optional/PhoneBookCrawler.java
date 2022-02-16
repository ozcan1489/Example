package com.Rx.Example.Optional;

import java.util.ArrayList;
import java.util.Optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook){
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
         return phoneBook.findPhoneNumberByName(name).
                 orElseThrow(()-> new IllegalArgumentException(("No phone number found")));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        StringBuilder result = new StringBuilder();
        phoneBook.findPhoneNumberByName(name)
                .ifPresentOrElse(phoneNumber -> result.append(phoneNumber) , ()-> System.out.println(phoneBook.getPhoneBookEntries()));
        return result.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
         String result = "";
        Optional<String> phoneNumberExists = phoneBook.findNameByPhoneNumber(phoneNumber);
        Optional<String> nameExists = phoneBook.findPhoneNumberByName(name);
        if(phoneNumberExists.isPresent()){
            return phoneNumberExists.get();
        }
        else if(nameExists.isPresent()){
            return nameExists.get();
        }
         return new ArrayList<>(phoneBook.getPhoneBookEntries().values()).get(0);
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }
}

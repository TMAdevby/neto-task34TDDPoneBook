package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String,String> book = new HashMap<>();

    public boolean add(String name, String number) {
        if (book.containsKey(name)) {
            return false;
        }
        book.put(name, number);
        return true;
    }

    public String get(String name) {
        return book.get(name);
    }

    public String findByNumber(String number) {

        for (Map.Entry<String,String> entry : book.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }

        return null;
    }


}

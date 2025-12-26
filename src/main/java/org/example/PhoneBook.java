package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, String> nameToNumber = new HashMap<>();
    private final Map<String, String> numberToName = new HashMap<>();

    public int add(String name, String number) {
        if (nameToNumber.containsKey(name)) {
            return nameToNumber.size();
        }
        nameToNumber.put(name, number);
        numberToName.put(number, name);
        return nameToNumber.size();
    }

    public String getNumber(String name) {
        return nameToNumber.get(name);
    }

    public String getNameByNumber(String number) {
        return numberToName.get(number); // O(1) — без перебора!
    }


    public String findByNumber(String number) {
        if(numberToName.containsKey(number)){
            return numberToName.get(number);
        }
        return null;
    }

    public String findByName(String name){
        return null;
    }

}

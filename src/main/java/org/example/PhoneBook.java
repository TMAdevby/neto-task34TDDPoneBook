package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private final Map<String, String> nameToNumber = new TreeMap<>();
    private final Map<String, String> numberToName = new TreeMap<>();

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
        return numberToName.get(number);
    }


    public String findByNumber(String number) {
        if(numberToName.containsKey(number)){
            return numberToName.get(number);
        }
        return null;
    }

    public String findByName(String name){
        if(nameToNumber.containsKey(name)){
            return nameToNumber.get(name);
        }
        return null;
    }

    public ArrayList<String> getAllNamesInOrder(){
        //return new ArrayList<String>(nameToNumber.keySet());
        return new ArrayList<String>();
    }

}

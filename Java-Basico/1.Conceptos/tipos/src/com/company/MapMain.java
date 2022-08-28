package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("123456", "Juan Garcia");
        personas.put("124567", "Felix Bolaños");
        personas.put("455643", "Laura de María");

        System.out.println(personas.size());

        for (String key : personas.keySet()) {
            System.out.println(key);
            System.out.println(personas.get(key));
        }

        for (String value : personas.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }
    }
}

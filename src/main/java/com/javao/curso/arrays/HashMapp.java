package com.javao.curso.arrays;

import java.util.HashMap;

public class HashMapp {
  public static void main(String[] args) {
    
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    people.put("Angelina Jolie", 43);
    people.put("Brad Pitt", 54);
    people.put("Bradley Cooper", 45);

    for(String key: people.keySet()){
      System.out.println(key + ": " + people.get(key));
    }
    people.containsKey("Angelina Jolie"); 
    people.containsValue(43);
    people.remove("Angelina Jolie");
    System.out.println(people);
  }
}

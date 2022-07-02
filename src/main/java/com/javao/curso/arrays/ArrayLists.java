package com.javao.curso.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>(); 
    cars.add("BMW");
    cars.add("Audi");
    cars.add("FOX");
    cars.add("Ferrari");
    System.out.println(cars);

    cars.remove(2); //fox
    System.out.println(cars);

    cars.set(1, "Fiat"); //audi vira fiat
    System.out.println(cars);

    //cars.clear(); //limpa o array

    System.out.println(cars.size()); //4

    //usando loop pra percorrer
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }

    for(String i: cars){
      System.out.println(i);
    }

    //classificar lista
    Collections.sort(cars);
  }
}

package com.javao.curso.arrays;

import java.util.LinkedList;

public class LinkedLists {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("BMW");
    cars.add("Audi");
    cars.add("FOX");
    cars.add("Ferrari");

    cars.removeLast(); //fox
    cars.removeFirst(); //bmw
    cars.set(1, "Camaro"); //audi vira camaro
    cars.getFirst(); //camaro
    cars.getLast(); //ferrari
    cars.size(); //3
    cars.addFirst("Fiat"); //fiat vira primeiro
    cars.addLast("Porsche"); //porsche vira ultimo
    System.out.println(cars);
  }

}

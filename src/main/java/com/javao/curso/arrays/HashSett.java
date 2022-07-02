package com.javao.curso.arrays;

import java.util.HashSet;
//coleção de itens onde cada item é único

public class HashSett {
  /**
   * @param args
   */
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}

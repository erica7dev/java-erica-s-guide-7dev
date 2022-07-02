package com.javao.curso.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {
  public static void main(String[] args) {
    //é um objeto que pode ser usado para loop através de coleções, como ArrayList e HashSet. É chamado de "iterador" porque "iterating" é o termo técnico para looping

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
  }


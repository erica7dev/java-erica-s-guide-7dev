package com.javao.curso.Um;

public class Main {
  public static void main(String[] args) {
    //operador ternário
    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    int $teste_34 = 32;
    System.out.println("Hello,World!");

    // passando argumentos
    System.out.println("Hello " + args[0]);

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
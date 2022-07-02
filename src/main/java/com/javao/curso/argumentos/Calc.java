package com.javao.curso.argumentos;

public class Calc {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);

    if(args[0].equals("somar")){
      sum(x,y);
    }

  }

  static void sum(int x, int y){
    System.out.println("A soma é: " + (x + y));
  }

  static void minus(int x, int y){
    System.out.println("A subtração é: " + (x - y));
  }
  
}

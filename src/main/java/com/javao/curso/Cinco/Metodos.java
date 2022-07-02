package com.javao.curso.Cinco;

public class Metodos {
  static int myMethod(int x) {
    return 5 + x;
  }

  //sobrecarga
  static int plusMethodInt(int x, int y) {
    return x + y;
  }
  
  static double plusMethodDouble(double x, double y) {
    return x + y;
  }
  public static void main(String[] args) {
    nome("Eri");
  }
  static void nome(String fname){
    System.out.println("Meu nome é " + fname);
  }

  //recursividade
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

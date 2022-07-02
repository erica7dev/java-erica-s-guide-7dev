package com.javao.curso.Quatro;

public class BreakContinue {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }

    for (int j = 0; j < 10; j++) {
      if (j == 4) {
        continue;
      }
      System.out.println(j);
    }
  }
}

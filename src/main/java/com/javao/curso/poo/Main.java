package com.javao.curso.poo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Classuda classuda = new Classuda("Erica", 20, "Brasil", true);
    Classuda classuda2 = new Classuda("Preta");

    Classuda.Andar(classuda.getName());

    System.out.println(classuda.Correr(true));
    System.out.println(classuda.getName());

    //obter entrada
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);

    //Enum
    enum DIA {
      DOMINGO,
      SEGUNDA,
      TERÇA
    }

    DIA task = DIA.DOMINGO; 
    System.out.println(task);

    switch(task) {
      case DOMINGO:
        System.out.println("Dia de lavar as calcinhas");
        break;
      case SEGUNDA:
         System.out.println("Começo de semana, credo capeta!");
        break;
      case TERÇA:
        System.out.println("Dia de trabalhar");
        break;
    }

    //loop com ENUm
    for (DIA diaQualquer : DIA.values()) {
      System.out.println(diaQualquer);
    }
  }
}

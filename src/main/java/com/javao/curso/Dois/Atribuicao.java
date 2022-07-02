package com.javao.curso.Dois;

public class Atribuicao {
  public static void main(String[] args) {
    //métodos de string
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
    System.out.println("The length of the txt string is: " + txt.length());
    System.out.println("The first letter of the txt string is: " + txt.charAt(0));
    System.out.println("The last letter of the txt string is: " + txt.charAt(txt.length() - 1));
    System.out.println(txt.toLowerCase());
    System.out.println(txt.toUpperCase());
    System.out.println(txt.lastIndexOf("n"));
    System.out.println(txt.indexOf("e"));


    //caracteres de escape
    System.out.println("\n");
    System.out.println("\\");
    System.out.println("\"");
    System.out.println("\'");
    System.out.println("\b");
    System.out.println("\f");
    System.out.println("\r");
    System.out.println("\t");
  }

}

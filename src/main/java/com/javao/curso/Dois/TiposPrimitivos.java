package com.javao.curso.Dois;

public class TiposPrimitivos {
  public static void main(String[] args){
    int idade = (int) 10000000L;
    long numeroGrandao = (long) idade; // int maior 
    double salarioDecimal = 13.24;
    float salarioFloat = 23.5f;
    char letra = 'a';
    boolean verdadeiro = true;
    byte numeroPequenino = -3; // negativo ou positivo
    short numeroPequeno = 34; //negativo ou positivo
    System.out.println(numeroGrandao);
    System.out.println(idade);
  }
}

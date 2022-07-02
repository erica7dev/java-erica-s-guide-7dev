package com.javao.curso.Um;

public class EstruturaCondicional2 {
  public static void main(String[] args) {
    // Doar se salario > 5000
    double salario = 6000;
    //(condicao) ? verdadeiro : falso

    String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

    System.out.println(resultado);

    int idade = 20;
    String categoria;

    if (idade < 15) {
        categoria = "Categoria Infantil";
    } else if (idade >= 15 && idade < 18) {
        categoria = "Categoria Juvenil";
    } else {
        categoria = "Categoria Adulto";
    }

    categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
    System.out.println(categoria);

    //recursividade
}
public static int sum(int x) {
    if (x > 0) {
      return x + sum(x - 1);  //espécie de fatorial
    } else {
      return 0;
    }
  }
}


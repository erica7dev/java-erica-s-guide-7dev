package com.javao.curso.Um;

public class Operadores {
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 20;

    double resultado = n1 / (double) n2;

    int resto = 21 % 7;
    System.out.println(resto);

    // &&(AND) ||(OR) !(NOT)

    int age = 21;
    float salario = 3500f;
    boolean isElder = age > 18 && salario > 2000;
    System.out.println(isElder);

    double valorTotalContaCorrente = 200;
    double valorTotalContaPoupanca = 10000;
    float valorPlaystation = 5000F;
    boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
        || valorTotalContaPoupanca > valorPlaystation;
    System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

    // = += -= *= /= %=
    double bonus = 1800; // 1800
    bonus += 1000; // 2800
    bonus -= 1000; // 1800
    bonus *= 2;
    bonus /= 2;
    bonus %= 2;
    System.out.println(bonus);

    // ++ --
    int contador = 0;
    contador += 1; // contador = contador + 1;
    contador++;
    contador--;
    ++contador;
    --contador;
    int contador2 = 0;
    System.out.println(++contador2);
  }

}

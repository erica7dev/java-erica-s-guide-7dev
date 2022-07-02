package com.javao.curso.regex; //sequência de caracteres que forma um padrão de pesquisa

import java.util.regex.Matcher; //procurar o padrão
import java.util.regex.Pattern;  //Define um padrão de pesquisa
//PatternSyntaxException - Indica erro de sintaxe em um padrão 

//CASE_INSENSITIVE - c e C é a mesma coisa
//LITERAL - caracteres especiais são tratados como comuns
//UNICODE_CASE - ignora letras fora do alfabeto da lingua x (junto do primeiro)

public class Teste {
  
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("abobrinha", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("ABOBRINHA cremosa"); 
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Achou!!! Pode comer filhote!");
    } else {
      System.out.println("Non ecxiste! vai ficar com fome");
    }
  }
}

package com.javao.curso.errors;

public class Exceptions {
public static void main(String[] args) {
  try {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]);
    throw new Exception("Erro");
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }

  checkAge(19);
}

static void checkAge(int age) {
  if (age < 18) {
    throw new ArithmeticException("Access denied - You must be at least 18 years old.");
  }
  else {
    System.out.println("Access granted - You are old enough!");
  }
}
}



package com.javao.curso.Threadss;

//permite que um programa opere de forma mais eficiente, fazendo várias coisas ao mesmo tempo.

// usados para executar tarefas complicadas em segundo plano sem interromper o programa principal

// forma 1
/*public class Threadss extends Thread {
  public static void Threadss(String[] args) {
    Threadss thread = new Threadss();
    thread.start();
    System.out.println("fora");
  }
  public void run() {
    System.out.println("dentro");
  }
}
*/

// forma 2
/* 
public class Threadss implements Runnable {
  public static void main(String[] args) {
    Threadss task1 = new Threadss();
    Thread thread = new Thread(task1);
    thread.start();
    System.out.println("O código está fora da thread");
  }

  public void run {
    System.out.println("O código está dentro da thread");
  }
}*/


public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    // espera a thread acabar (async)
    while(thread.isAlive()) {
    System.out.println("Acaba trem...");
  }
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}
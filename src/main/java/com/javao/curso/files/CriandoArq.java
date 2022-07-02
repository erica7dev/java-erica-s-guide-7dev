package com.javao.curso.files;

import java.io.File;
import java.io.IOException;

public class CriandoArq {
  public static void main(String[] args) {
    try {
      File novoArquivo = new File("rapadura.txt");
      if (novoArquivo.createNewFile()) {
        System.out.println("Arquivo criado -> " + novoArquivo.getName());
      } else {
        System.out.println("Arquivo já existe");
      }
    } catch (IOException e) {
      System.out.println("Deu erro filho!");
      e.printStackTrace();
    }
  }
}

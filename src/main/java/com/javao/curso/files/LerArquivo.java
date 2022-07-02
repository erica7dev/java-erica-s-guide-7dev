package com.javao.curso.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class LerArquivo {
  public static void main(String[] args) {
    try{
      File novo = new File("src/main/java/com/javao/curso/files/teste.txt");
      if (novo.exists()) {
        System.out.println("File name: " + novo.getName());
        System.out.println("Absolute path: " + novo.getAbsolutePath());
        System.out.println("Writeable: " + novo.canWrite());
        System.out.println("Readable " + novo.canRead());
        System.out.println("File size in bytes " + novo.length());
      } else {
        System.out.println("The file does not exist.");
      }
      Scanner reader = new Scanner(novo);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    } catch(FileNotFoundException e){
      System.out.println("Arquivo não encontrado");
      e.printStackTrace();
    }
  }
}

package com.javao.curso.files;

import java.io.File;

public class DeleteArq {
  public static void main(String[] args) { 
    File myObj = new File("DeleteArq.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 

    //também posso deletar a pasta com o comando:
    //File myObj = new File("C:\\Users\eliav\\Desktop\\files");
  } 
}

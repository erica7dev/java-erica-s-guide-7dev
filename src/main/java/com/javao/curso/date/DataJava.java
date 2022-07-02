package com.javao.curso.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataJava {
  public static void main(String[] args) {
    //data
    LocalDate dataAtual = LocalDate.now(); 
    LocalTime tempo = LocalTime.now();
    LocalTime tempo2 = LocalTime.of(12, 30, 0);
    //data de nasc.
    LocalDate dataNascimento = LocalDate.of(2001, 02, 16); //ano, mes, dia

    LocalDateTime dataModificada = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formateDate = dataModificada.format(myFormatObj); //formata a data
    System.out.println(dataAtual);
  }
}

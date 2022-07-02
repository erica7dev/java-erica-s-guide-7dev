package com.javao.curso.poo;

public class Classuda {
  private String name;
  private int age;
  private String hairColor;
  private String country;
  private boolean job;

  public Classuda(String name, int age, String country, boolean job) {
    this.name = name;
    this.age = age;
    this.country = country;
    this.job = job;
  }

  public Classuda(String hair){
    this.hairColor = hair;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  //método static
  static void Andar(String nome) {
    System.out.printf("%s anda muito!", nome);
  }

  //método não static
  //pode ser void tbm
  public boolean Correr(Boolean maxSpeed) {
    return maxSpeed;
    
  }
}

class Avrinha extends Classuda    {
  //private String lastName = "Peretz"; // atributo de classe já pode ser chamado direto pela instancia
  private String lastName;
  private String religion;   

  @Override
  // Se você não reescrever o método ele terá o comportamente da classe Pai, que pela lógica só há uma implementação.
  public boolean Correr(Boolean maxSpeed) {
    return maxSpeed = null;
  }

 
  public Avrinha(String name, int age, String country, boolean job, String lastName, String religion) {
    super(name, age, country, job); // o que eu quero catar do construtor pai
    this.lastName = lastName;
    this.religion = religion;
  }

  public void favoriteSong() {
    System.out.println("Tel Aviv - Omer Adam");
  }
}

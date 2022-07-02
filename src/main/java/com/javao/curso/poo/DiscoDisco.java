package com.javao.curso.poo;

//ocultar certos detalhes e mostrar apenas informações essenciais ao usuário.
//classe restrita que não pode ser usada para criar objetos (para acessá-lo, deve ser herdado de outra classe)
abstract public class DiscoDisco {
  private String singerIsraeli;
  public abstract void favoriteSong();
  public void bailar() {
    System.out.println("Sei lá");
  }
}

//método abstracto
//só pode ser usado em uma classe abstrata, e não tem um corpo. O corpo é fornecido pela subclasse (herdada de)
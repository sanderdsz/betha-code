package Animal;

public class Main {
  public static void main(String[] args) {
    Animal gorila = new Animal("King Kong", 40.50, 1000.0, "AURRRRHHHHHH");

    gorila.rugido(gorila.som);

    gorila.pular(gorila.altura);
  }

  public static class Animal {
    String nome;
    Double altura;
    Double peso;
    String som;

    public Animal(String nome, Double altura, Double peso, String som) {
      this.nome = nome;
      this.altura = altura;
      this.peso = peso;
      this.som = som;
    }

    void rugido(String som) {
      System.out.println(som);
    }

    public void pular(Double altura) {
      System.out.println("O animal pula " + altura + " metros de altura");
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public Double getAltura() {
      return altura;
    }

    public void setAltura(Double altura) {
      this.altura = altura;
    }

    public Double getPeso() {
      return peso;
    }

    public void setPeso(Double peso) {
      this.peso = peso;
    }

    public String getSom() {
      return som;
    }

    public void setSom(String som) {
      this.som = som;
    }
  }

}

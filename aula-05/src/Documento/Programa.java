package Documento;

public class Programa {
  public static void main(String[] args) {
    Documento documento1;
    documento1 = new Documento();

    documento1.codigo = 123;
    documento1.nome = "Teste";
    documento1.dataNascimento = "09-11-1992";
    documento1.foto = "teste.jpg";

    System.out.printf("Codigo: " + documento1.codigo);
  }

}

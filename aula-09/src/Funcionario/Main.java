package Funcionario;

public class Main {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Foo", 1000.00);
    System.out.println(gerente.getBonificacao());

    SecretariaAgencia secretariaAgencia = new SecretariaAgencia("Bar", 500.00);
    System.out.println(secretariaAgencia.getBonificacao());
  }
}

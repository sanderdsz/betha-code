package Funcionario;

public class Diretor extends Gerente{
  public Diretor(String nome, Double bonificacao) {
    super(nome, bonificacao);
  }

  @Override
  public Double getBonificacao() {
    return super.getBonificacao() * 1.20;
  }
}

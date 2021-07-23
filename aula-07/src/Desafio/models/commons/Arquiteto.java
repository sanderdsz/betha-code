package Desafio.models.commons;

public class Arquiteto extends Funcionario{

  public Arquiteto(Integer id, String nome, String cpf, Double salarioBruto) {
    super(id, nome, cpf, salarioBruto);
  }

  public Arquiteto() {

  }

  @Override
  public Double getSalarioBruto() {
    return super.getSalarioBruto() + super.getSalarioBruto() * 0.15;
  }
}

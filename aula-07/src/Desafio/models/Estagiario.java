package Desafio.models;

import Desafio.models.commons.Funcionario;

public class Estagiario extends Funcionario {

  public Estagiario(Integer id, String nome, String cpf, Double salarioBruto) {
    super(id, nome, cpf, salarioBruto);
  }

  public Estagiario() {
    super();
  }

  @Override
  public Double getSalarioBruto() {
    return super.getSalarioBruto() + super.getSalarioBruto() * 0.05;
  }
}

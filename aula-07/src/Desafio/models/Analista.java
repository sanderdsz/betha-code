package Desafio.models;

import Desafio.models.commons.Funcionario;

public class Analista extends Funcionario {
  public Analista(Integer id, String nome, String cpf, Double salarioBruto) {
    super(id, nome, cpf, salarioBruto);
  }

  public Analista() {

  }

  @Override
  public Double getSalarioBruto() {
    return super.getSalarioBruto() + super.getSalarioBruto() + 0.10;
  }
}

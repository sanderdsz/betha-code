package Desafio.models;

import Desafio.models.commons.PessoaFisica;

public class Funcionario extends PessoaFisica {

  private Double salarioBruto;
  private Double salarioLiquido;

  public Funcionario(Integer ID,
                     String nome,
                     String endereco,
                     String telefone,
                     String cpf,
                     String rg,
                     String sexo,
                     Double salarioBruto,
                     Double salarioLiquido) {
    super(ID, nome, endereco, telefone, cpf, rg, sexo);
    this.salarioBruto = salarioBruto;
    this.salarioLiquido = salarioLiquido;
  }

  public void aplicarDissidio(Double valor) {
    this.salarioBruto = salarioBruto + valor;
  }

  public Double getSalarioBruto() {
    return salarioBruto;
  }

  public void setSalarioBruto(Double salarioBruto) {
    this.salarioBruto = salarioBruto;
  }

  public Double getSalarioLiquido() {
    return salarioLiquido;
  }

  public void setSalarioLiquido(Double salarioLiquido) {
    this.salarioLiquido = salarioLiquido;
  }
}

package Desafio.models;

import Desafio.models.commons.PessoaFisica;

public class Cliente extends PessoaFisica {

  private Double limiteCrediario;
  private Double limiteUtilizado;

  public Cliente(Integer ID,
                 String nome,
                 String endereco,
                 String telefone,
                 String cpf, String rg,
                 String sexo,
                 Double limiteCrediario,
                 Double limiteUtilizado) {
    super(ID, nome, endereco, telefone, cpf, rg, sexo);
    this.limiteCrediario = limiteCrediario;
    this.limiteUtilizado = limiteUtilizado;
  }

  public void aumentarLimiteCrediario(Double valor) {
    this.limiteCrediario = limiteCrediario + valor;
  }

  public void diminuirLimiteCrediario(Double valor) {
    this.limiteCrediario = limiteCrediario - valor;
  }

  public Double getLimiteCrediario() {
    return limiteCrediario;
  }

  public void setLimiteCrediario(Double limiteCrediario) {
    this.limiteCrediario = limiteCrediario;
  }

  public Double getLimiteUtilizado() {
    return limiteUtilizado;
  }

  public void setLimiteUtilizado(Double limiteUtilizado) {
    this.limiteUtilizado = limiteUtilizado;
  }
}

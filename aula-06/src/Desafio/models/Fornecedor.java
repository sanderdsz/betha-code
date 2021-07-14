package Desafio.models;

import Desafio.models.commons.PessoaJuridica;

public class Fornecedor extends PessoaJuridica {

  private String responsavel;
  private String observacoes;

  public Fornecedor(Integer ID,
                    String nome,
                    String endereco,
                    String telefone,
                    String cnpj,
                    String inscricaoEstadual,
                    String cnae,
                    String responsavel,
                    String observacoes) {
    super(ID, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
    this.responsavel = responsavel;
    this.observacoes = observacoes;
  }

  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }
}

package Desafio.models.commons;

public class PessoaJuridica extends Pessoa{

  private String cnpj;
  private String inscricaoEstadual;
  private String cnae;

  public PessoaJuridica(Integer ID, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae) {
    super(ID, nome, endereco, telefone);
    this.cnpj = cnpj;
    this.inscricaoEstadual = inscricaoEstadual;
    this.cnae = cnae;
  }

  @Override
  public String getDocumentoPrincipal() {
    return cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  public String getCnae() {
    return cnae;
  }

  public void setCnae(String cnae) {
    this.cnae = cnae;
  }

  public PessoaJuridica(Integer ID, String nome, String endereco, String telefone) {
    super(ID, nome, endereco, telefone);
  }
}

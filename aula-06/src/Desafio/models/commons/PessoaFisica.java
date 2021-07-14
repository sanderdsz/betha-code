package Desafio.models.commons;

public class PessoaFisica extends Pessoa {

  private String cpf;
  private String rg;
  private String sexo;

  public PessoaFisica(Integer ID, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
    super(ID, nome, endereco, telefone);
    this.cpf = cpf;
    this.rg = rg;
    this.sexo = sexo;
  }

  @Override
  public String getDocumentoPrincipal() {
    return cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public PessoaFisica(Integer ID, String nome, String endereco, String telefone) {
    super(ID, nome, endereco, telefone);
  }
}

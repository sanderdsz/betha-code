package Casa;

public class Casa {

  private String endereco;
  private Long salas;
  private Long banheiros;
  private Long quartos;
  private Double metragemQuadrada;

  public Casa(String endereco, Long salas, Long banheiros, Long quartos, Double metragemQuadrada) {
    this.endereco = endereco;
    this.salas = salas;
    this.banheiros = banheiros;
    this.quartos = quartos;
    this.metragemQuadrada = metragemQuadrada;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Long getSalas() {
    return salas;
  }

  public void setSalas(Long salas) {
    this.salas = salas;
  }

  public Long getBanheiros() {
    return banheiros;
  }

  public void setBanheiros(Long banheiros) {
    this.banheiros = banheiros;
  }

  public Long getQuartos() {
    return quartos;
  }

  public void setQuartos(Long quartos) {
    this.quartos = quartos;
  }

  public Double getMetragemQuadrada() {
    return metragemQuadrada;
  }

  public void setMetragemQuadrada(Double metragemQuadrada) {
    this.metragemQuadrada = metragemQuadrada;
  }

  @Override
  public String toString() {
    return "Casa{" +
            "endereco='" + endereco + '\'' +
            ", salas=" + salas +
            ", banheiros=" + banheiros +
            ", quartos=" + quartos +
            ", metragemQuadrada=" + metragemQuadrada +
            '}';
  }
}

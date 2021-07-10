package Construção;

public class Construção {

  private Integer salas;
  private Integer banheiros;
  private Integer quartos;
  private Double metragemQuadrada;

  public Construção(Integer salas, Integer banheiros, Integer quartos, Double metragemQuadrada) {
    this.salas = salas;
    this.banheiros = banheiros;
    this.quartos = quartos;
    this.metragemQuadrada = metragemQuadrada;
  }

  public Integer getSalas() {
    return salas;
  }

  public void setSalas(Integer salas) {
    this.salas = salas;
  }

  public Integer getBanheiros() {
    return banheiros;
  }

  public void setBanheiros(Integer banheiros) {
    this.banheiros = banheiros;
  }

  public Integer getQuartos() {
    return quartos;
  }

  public void setQuartos(Integer quartos) {
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
    return "Construção{" +
            "salas=" + salas +
            ", banheiros=" + banheiros +
            ", quartos=" + quartos +
            ", metragemQuadrada=" + metragemQuadrada +
            '}';
  }
}

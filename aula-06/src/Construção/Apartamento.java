package Construção;

public class Apartamento extends Construção{

  Apartamento apartamento = new Apartamento(1, 2, 3, 107.38);

  public Apartamento(Integer salas, Integer banheiros, Integer quartos, Double metragemQuadrada) {
    super(salas, banheiros, quartos, metragemQuadrada);
  }
}

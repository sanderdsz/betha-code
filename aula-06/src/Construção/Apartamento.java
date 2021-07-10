package Construção;

public class Apartamento extends Construção{


  public Apartamento(Integer salas, Integer banheiros, Integer quartos, Double metragemQuadrada) {
    super(salas, banheiros, quartos, metragemQuadrada);
    Apartamento apartamento = new Apartamento(1, 2, 3, 107.38);
  }
}

package Carro;

public class Carro implements Veiculo, Motor{

  @Override
  public String getNome() {
    return "Gol";
  }

  @Override
  public String getId() {
    return "0114";
  }

  @Override
  public String getModelo() {
    return "1.0 2021";
  }

  @Override
  public String getFabricante() {
    return "Volkswagem";
  }
}

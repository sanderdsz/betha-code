package FiguraGeometrica;

public class Quadrado implements FiguraGeometrica{

  private int lado;

  public Quadrado(int lado) {
    this.lado = lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }

  @Override
  public int getPerimetro() {
    return lado * 4;
  }

  @Override
  public int getArea() {
    return lado * lado;
  }

  @Override
  public String getNomeFigura() {
    return "Quadrado";
  }

}

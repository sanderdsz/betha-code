package FiguraGeometrica;

public class Triangulo implements FiguraGeometrica{

  private int base;
  private int altura;
  private int ladoA;
  private int ladoB;
  private int ladoC;

  public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC) {
    this.base = base;
    this.altura = altura;
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setLadoA(int ladoA) {
    this.ladoA = ladoA;
  }

  public void setLadoB(int ladoB) {
    this.ladoB = ladoB;
  }

  public void setLadoC(int ladoC) {
    this.ladoC = ladoC;
  }

  @Override
  public int getPerimetro() {
    return ladoA + ladoB + ladoC;
  }

  @Override
  public int getArea() {
    return (base * altura) / 2;
  }

  @Override
  public String getNomeFigura() {
    return "Triangulo";
  }
}

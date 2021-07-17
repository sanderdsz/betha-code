package Calculadora;

public class Calculadora {

  public static void main(String[] args) {

    Calculadora calculadora = new Calculadora(2, 3);
    calculadora.calcular(2, 3);
    calculadora.calcular(2.0, 4.0);
    calculadora.calcular("1", "4");

  }

  private Integer a;
  private Integer b;

  public Calculadora(Integer a, Integer b) {
    this.a = a;
    this.b = b;
  }

  public void calcular(Integer a, Integer b) {
    System.out.println(a + b);
  }

  public void calcular(Double a, Double b) {
    System.out.println(a + b);
  }

  public void calcular(String a, String b) {
    System.out.println(String.valueOf(a) + String.valueOf(b));
  }

  public Integer getA() {
    return a;
  }

  public void setA(Integer a) {
    this.a = a;
  }

  public Integer getB() {
    return b;
  }

  public void setB(Integer b) {
    this.b = b;
  }
}

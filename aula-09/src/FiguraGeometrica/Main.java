package FiguraGeometrica;

public class Main {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado(2);
    System.out.println(quadrado.getPerimetro());
    System.out.println(quadrado.getArea());
    System.out.println(quadrado.getNomeFigura());

    Triangulo triangulo = new Triangulo(2, 3, 2, 2, 2);
    System.out.println(triangulo.getPerimetro());
    System.out.println(triangulo.getArea());
    System.out.println(triangulo.getNomeFigura());
  }
}

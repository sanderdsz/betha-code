package casa;

public class Main {
  public static void main(String[] args) {
    Casa casa = new Casa("Rua Afonso Celso 182", 1L, 2L, 3L, 107.38);

    casa.setMetragemQuadrada(135.0);

    if (casa.getMetragemQuadrada() > 120.0) {
      System.out.println("Casa do fulano");
    }

    System.out.println(casa);
  }
}
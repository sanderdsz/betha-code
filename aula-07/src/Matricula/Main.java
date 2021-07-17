package Matricula;

public class Main {

  public static void main(String[] args) {

    Matricula matricula1 = MatriculaBuilder.criaMatricula("Funcionario");
    matricula1.setSalario(1000.0);
    System.out.println(matricula1.getSalario());

    Matricula matricula2 = MatriculaBuilder.criaMatricula("Estagiario");
    matricula2.setSalario(1000.0);
    System.out.println(matricula2.getSalario());

  }

  public static class MatriculaBuilder {
    public static Matricula criaMatricula(String tipo) {
      if (tipo.equals("Funcionario")) {
        return new Funcionario();
      } else {
        return new Estagiario();
      }
    }
  }

  public static class Estagiario extends Matricula {

    public Double getSalario() {
      return super.getSalario() + (super.getSalario() * 0.1);
    }
  }

  public static class Funcionario extends Matricula {

    public Double getSalario() {
      return (super.getSalario() + (super.getSalario() * 0.2));
    }
  }

  public static class Matricula {

    private Double salario;
    private String tipo;

    public Double getSalario() {
      return salario;
    }

    public void setSalario(Double salario) {
      this.salario = salario;
    }

    public String getTipo() {
      return tipo;
    }

    public void setTipo(String tipo) {
      this.tipo = tipo;
    }
  }
}

package Desafio;

import Desafio.models.Analista;
import Desafio.models.Estagiario;
import Desafio.models.commons.Arquiteto;
import Desafio.models.commons.Coordenador;
import Desafio.models.commons.Funcionario;

import java.util.Date;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("hello world");

    Funcionario funcionario1 = FuncionarioBuilder.criaFuncionario("ESTAGIARIO");
    funcionario1.setSalarioBruto(1000.00);
    System.out.println(funcionario1.getSalarioBruto());

  }

  public static class FuncionarioBuilder {
    public static Funcionario criaFuncionario(String tipo) {
      if (tipo.equals("ESTAGIARIO")) {
        return new Estagiario();
      } if (tipo.equals("ANALISTA")) {
        return new Analista();
      } if (tipo.equals("ARQUITETO")) {
        return new Arquiteto();
      } else {
        return new Coordenador();
      }
    }
  }

  public static class Folha {

    private Integer id;
    private Funcionario funcionario;
    private Date dataPagamento;
    private Descontos[] descontos;
    private Double salarioLiquido;

    public Folha(Integer id, Funcionario funcionario, Date dataPagamento, Descontos[] descontos, Double salarioLiquido) {
      this.id = id;
      this.funcionario = funcionario;
      this.dataPagamento = dataPagamento;
      this.descontos = descontos;
      this.salarioLiquido = salarioLiquido;
    }

    public void calcular() {
      this.calcular(null, null);
    }

    public void calcular(Descontos[] descontos) {
      this.calcular(descontos, null);
    }

    public void calcular(Descontos[] descontos, Double bonus) {
      Double salarioBruto = funcionario.getSalarioBruto();
      Double salarioLiquido = salarioBruto;

      // salarioLiquido -= get

    }

    public Double getDescontoIRPF(Double salarioBruto) {
      Double desconto = 0.0;
      Double descontoPercentual = 0.0;

      if (salarioBruto < 1991.90) {
        descontoPercentual = 0.0;
      } return null;
    }

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public Funcionario getFuncionario() {
      return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
      this.funcionario = funcionario;
    }

    public Date getDataPagamento() {
      return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
      this.dataPagamento = dataPagamento;
    }

    public Descontos[] getDescontos() {
      return descontos;
    }

    public void setDescontos(Descontos[] descontos) {
      this.descontos = descontos;
    }

    public Double getSalarioLiquido() {
      return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
      this.salarioLiquido = salarioLiquido;
    }
  }

  public static class Descontos {

    private Integer id;
    private String descricao;
    private Double valor;

    public Descontos(Integer id, String descricao, Double valor) {
      this.id = id;
      this.descricao = descricao;
      this.valor = valor;
    }

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getDescricao() {
      return descricao;
    }

    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }

    public Double getValor() {
      return valor;
    }

    public void setValor(Double valor) {
      this.valor = valor;
    }
  }
}

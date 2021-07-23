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
  }

  public static class FuncionarioBuilder {
    public static Funcionario criaFuncionario(String tipo) {
      switch (tipo) {
        case "ESTAGIARIO":
          return new Estagiario();
        case "ANALISTA":
          return new Analista();
        case "ARQUITETO":
          return new Arquiteto();
        case "COORDENADOR":
          return new Coordenador();
      }
    }
  }

  public static class Folha {

    private Integer id;
    private Funcionario funcionario;
    private Date dataPagamento;
    private List<Descontos> descontos;
    private Double salarioLiquido;

    public Folha(Integer id, Funcionario funcionario, Date dataPagamento, List<Descontos> descontos, Double salarioLiquido) {
      this.id = id;
      this.funcionario = funcionario;
      this.dataPagamento = dataPagamento;
      this.descontos = descontos;
      this.salarioLiquido = salarioLiquido;
    }

    public Double calcular() {
      return
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

    public List<Descontos> getDescontos() {
      return descontos;
    }

    public void setDescontos(List<Descontos> descontos) {
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

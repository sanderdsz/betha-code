package Desafio;

import Desafio.models.Cliente;
import Desafio.models.Fornecedor;
import Desafio.models.Funcionario;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente(
            1,
            "Lorem Ipsum",
            "Rua Afonso Celso 182",
            "+5548999998888",
            "545.321.180-69",
            "50.592.630-1",
            "Masculino",
            1000.0,
            250.0);

    Funcionario funcionario = new Funcionario(
            2,
            "Foo Bar",
            "Av. Centenário sem número",
            "+5548977776666",
            "543.709.360-80",
            "39.473.727-1",
            "Feminino",
            3200.00,
            2750.00);

    Fornecedor fornecedor = new Fornecedor(
            3,
            "Betha Sistemas",
            "R. Júlio Gaidzinki 320",
            "+554834310733",
            "13.259.627/0001-03",
            "648.168.565",
            "3299-0/99",
            "Sit Dolor Amet",
            "Habitant lorem taciti mi suscipit torquent nibh felis nisl, " +
                    "vitae proin viverra ligula nec integer morbi taciti convallis.");

    System.out.println("--- Cliente ---");
    cliente.aumentarLimiteCrediario(1500.0);
    System.out.println("O limite aumentou para: " + cliente.getLimiteCrediario());
    cliente.diminuirLimiteCrediario(250.0);
    System.out.println("O limite diminuiu para: " + cliente.getLimiteCrediario());
    System.out.println("O cpf do cliente e: " + cliente.getDocumentoPrincipal());

    System.out.println("--- Funcionario ---");
    funcionario.aplicarDissidio(360.0);
    System.out.println("O novo salario apos dissidio e: " + funcionario.getSalarioBruto());
    System.out.println("O cpf do funcionario e: " + funcionario.getDocumentoPrincipal());

    System.out.println("--- Fornecedor ---");
    System.out.println("O cnpj do fornecedor e: " + fornecedor.getDocumentoPrincipal());


  }
}

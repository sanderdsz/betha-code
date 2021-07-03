package Corrida;

public class Programa {
  public static void main(String[] args) {
    // Criação dos carros que irão correr
    CarroDeCorrida carroEquipeVelocidade = new CarroDeCorrida();
    CarroDeCorrida carroEquipeTrapaceiros = new CarroDeCorrida();

    // Criação dos pilotos de cada equipe
    Piloto pilotoEquipeVelocidade = new Piloto();
    Piloto pilotoEquipeTrapaceiros = new Piloto();

    // Atributos dos pilotos
    pilotoEquipeVelocidade.nome = "Piloto 1";
    pilotoEquipeVelocidade.idade = 25;
    pilotoEquipeVelocidade.habilidade = 75;

    pilotoEquipeTrapaceiros.nome = "Piloto 2";
    pilotoEquipeTrapaceiros.idade = 27;
    pilotoEquipeTrapaceiros.habilidade = 65;

    // Pilotos colocados nos carros
    carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
    carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;

    // Identificação dos carros
    carroEquipeVelocidade.ligar();
    carroEquipeTrapaceiros.ligar();

    // Iniciar a corrida
    carroEquipeVelocidade.acelerar();
    carroEquipeTrapaceiros.acelerar();

    carroEquipeVelocidade.acelerar();
    carroEquipeTrapaceiros.acelerar();

    carroEquipeVelocidade.acelerar();
    carroEquipeTrapaceiros.velocidadeAtual = 200.0;

    System.out.println(carroEquipeVelocidade.velocidadeAtual);
    System.out.println(carroEquipeTrapaceiros.velocidadeAtual);
  }
}

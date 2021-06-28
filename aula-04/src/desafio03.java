import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class desafio03 {
  static void reverse(String[] reverseArray) {
    Collections.reverse(Arrays.asList(reverseArray));
    System.out.println("Reverse: " + Arrays.asList(reverseArray));
  }

  public static <fruits> void main(String[] args) {
    System.out.println("1 - Crie um programa que percorra um array de 10 posições e imprima o seu conteúdo.");
    System.out.println("2 - Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.");
    System.out.println("3 - Faça um programa que inverta as posições de um array com 10 elementos.");
    System.out.println("4 - Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de diálogo qual foi o dados passados.");
    System.out.println("5 - Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.");
    System.out.println("6 - Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.");
    System.out.print("Escolha o exercicio: ");
    Scanner scan = new Scanner(System.in);
    int exercicio = scan.nextInt();
    switch (exercicio) {
      case 1:

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Chevrolet", "Ferrari",
                "Subaru", "Toyota", "Nissan", "Hyundai"};
        for (String index : cars) {
          System.out.println(index);
        }
        break;

      case 2:
        int[] integers = {10, 20, 30, 40};
        int sum = 0;
        for (int index : integers) {
          sum += index;
        }
        int average = sum / integers.length;
        System.out.println("Values: " + Arrays.toString(integers));
        System.out.println("Average: " + average);
        break;

      case 3:
        String[] fruits = {"apples", "tomatoes", "bananas", "guavas", "pineapples"};
        System.out.println("Original: " + Arrays.asList(fruits));
        reverse(fruits);
        break;

      case 4:
        System.out.print("Type something: ");
        Scanner input04 = new Scanner(System.in);
        String inputText04 = input04.nextLine();
        JOptionPane.showMessageDialog(null, inputText04);
        break;

      case 5:
        Scanner s = new Scanner(System.in);
        int lenght = 10;
        String[] newArray = new String[lenght];
        for (int index = 0; index < lenght; index++) {
          newArray[index] = s.nextLine();
        }
        reverse(newArray);
        break;

      case 6:
        double weight;
        double height;
        weight = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your weight in kilos: ")
        );
        height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your height in meters: ")
        );
        double imc = weight / (height * height);
        DecimalFormat decimalFormat = new DecimalFormat("####0.00");
        String message = "Your IMC is: " + decimalFormat.format(imc);
        JOptionPane.showMessageDialog(null, message);
        String imcIndex;

        if (imc < 18.5) {
          imcIndex = "Underweight";
        } else if (imc > 18.5 && imc < 24.9) {
          imcIndex = "Normal weight";
        } else if (imc > 25 && imc < 29.9) {
          imcIndex = "Overweight";
        } else {
          imcIndex = "Obesity";
        }
        String finalMessage = "Your IMC Index is: " + imcIndex;
        JOptionPane.showMessageDialog(null, finalMessage);
    }
  }
}
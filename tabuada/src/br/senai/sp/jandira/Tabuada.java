package br.senai.sp.jandira;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da tabuada: ");
        int multiplicando = scanner.nextInt();

        System.out.print("Digite o valor mínimo do intervalo: ");
        int minimo = scanner.nextInt();

        System.out.print("Digite o valor máximo do intervalo: ");
        int maximo = scanner.nextInt();

        System.out.println("Tabuada do " + multiplicando);
        System.out.println("-------------------------");

        for (int i = minimo; i <= maximo; i++) {
            int resultado = multiplicando * i;
            System.out.println(multiplicando + " X " + i + " = " + resultado);
        }
        System.out.println("-------------------------");
        System.out.println("          F I M");
        System.out.println("-------------------------");

        scanner.close();
    }

}

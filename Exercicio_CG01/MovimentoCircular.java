package Exercicio_CG02;

import java.util.Scanner;

public class MovimentoCircular {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário as entradas
        System.out.print("Insira o raio da trajetória circular (em metros): ");
        double raio = entrada.nextDouble();

        System.out.print("Insira a velocidade angular (em rad/s): ");
        double velocidadeAngular = entrada.nextDouble();

        double velTangencialCalc = velocidadeAngular * raio; //Cálculo da velocidade tangecial

        double velAngularCalc = velTangencialCalc/raio; // Cálculo da velocidade angular

        double acelCentripeta = (velocidadeAngular*velocidadeAngular) * raio; //Cálculo da aceleração centripeta

        System.out.println("Velocidade tangencial: "+velTangencialCalc);
        System.out.println("Velocidade angular: "+velAngularCalc);
        System.out.println("Aceleração centripeta: "+acelCentripeta);

    }

}

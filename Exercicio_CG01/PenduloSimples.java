package Exercicio_CG02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PenduloSimples {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##"); // Chamando uma biblioteca para formatação de números quebrados

        System.out.print("Comprimento da corda (m): ");
        double comprimentoCorda = entrada.nextDouble();

        System.out.print("Massa do objeto pendurado (kg): ");
        double massaObjeto = entrada.nextDouble();

        System.out.print("Ângulo inicial (graus): ");
        double anguloInicial = Math.toRadians(entrada.nextDouble());

        System.out.print("Tempo total de simulação (s): ");
        double tempoTotal = entrada.nextDouble();

        double gravidade = 9.8;

        for (int i = 0; i < tempoTotal; i++) {
            System.out.println(Math.toDegrees(anguloInicial *Math.cos(Math.sqrt(gravidade / comprimentoCorda) * i))) ;
        }

    }
}
package Exercicio_CG02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcQuedaLivre {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##"); // Chamando uma biblioteca para formatação de números quebrados

        double altCont = 0;

        System.out.println("Usuário sabe a altura do objeto?");
        String decisao = entrada.next();

        if (decisao.equalsIgnoreCase("sim") || decisao.equalsIgnoreCase("s")){

            int altura = 0;

            while (true) { // Tratamento de exceção se o usuário digitar um número negativo

                System.out.println("Informe a altura que o objeto irá cair:");
                altura = entrada.nextInt();

                if(altura < 0) {
                    System.out.println("Insira a altura correta!");
                } else {
                    break;
                }
            }

            double tempo = Math.sqrt((altura * 2) / 9.8); // Cálculo do tempo para que o objeto colida com o solo

            for (int i = altura; i >= 0; i--) {
                System.out.println("Altura que o objeto está em metros: "+df.format(i)+" | Velocidade em m/s: "+df.format(altCont*9.8));
                altCont += tempo/altura; 
            }

            System.out.println("Objeto demorou "+df.format(tempo)+" segundo(s) para atingir o solo.");

        } else {

            double tempo = 0;
            while (true) { // Tratamento de exceção se o usuário digitar um número negativo

                System.out.println("Em quantos segundos o objeto chegou no chão?");
                tempo = entrada.nextDouble();

                if(tempo< 0) {
                    System.out.println("Insira o tempo correto!");
                } else {
                    break;
                }
            }
            double altura = 0.5*9.8*(tempo*tempo); // Cálculo para altura do objeto

            System.out.println("A altura do objeto: "+df.format(altura)+" metros.");

            for (double i = altura; i >= 0; i--) {
                System.out.println("Altura que o objeto está em metros: "+df.format(i)+" | Velocidade em m/s: "+df.format(altCont*9.8));
                altCont += tempo/altura; // Vendo em cada metro, quanto que está a velocidade do objeto
            }

        }






    }

}

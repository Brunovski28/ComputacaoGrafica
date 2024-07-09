package Exercicio_CG02;

import java.util.Scanner;

public class ColisaoParticulas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe as velocidades em (m/s) das partículas, [X] para horizontal, [Y] para vertical");

        System.out.println("Velocidade da 1° Partícula X");
        double vel1X = entrada.nextDouble();

        System.out.println("Velocidade da 1° Partícula Y");
        double vel1Y = entrada.nextDouble();

        System.out.println("Velocidade da 2° Partícula X");
        double vel2X = entrada.nextDouble();

        System.out.println("Velocidade da 2° Partícula Y");
        double vel2Y = entrada.nextDouble();

        System.out.println("Massa da 1° Partícula em kg");
        double massa1 = entrada.nextDouble();

        System.out.println("Massa da 2° Partícula em kg");
        double massa2 = entrada.nextDouble();

        // Cálculo do movimento linear
        double vel1final_x = ((massa1 - massa2) * vel1X + 2 * massa2 * vel2X) / (massa1 + massa2);
        double vel2final_x = ((massa2 - massa1) * vel2X + 2 * massa1 * vel1X) / (massa1 + massa2);

        double vel1final_y = vel1Y; // Velocidade vertical não muda
        double vel2final_y = vel2Y; //

        System.out.println("Velocidade final da 1° partícula X: "+vel1final_x+" m/s");
        System.out.println("Velocidade final da 2° partícula X: "+vel2final_x+" m/s");

        System.out.println("Velocidade das partículas Y contínua as mesmas!");

    }

}

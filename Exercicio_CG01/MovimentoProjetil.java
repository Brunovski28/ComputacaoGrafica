package Exercicio_CG02;

import java.util.Scanner;

public class MovimentoProjetil {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Angulo em relação ao solo:");
        double ang = entrada.nextDouble();

        System.out.println("Velocidade do projétil em m/s: ");
        double vel = entrada.nextDouble();

        System.out.println("Qual a altura do projétil está sendo lançado?");
        double alt = entrada.nextDouble();

        System.out.println("Informe em quantos segundos de intervalo de tempo");
        int segundosIntervalo = entrada.nextInt();


        double angRad = Math.toRadians(ang);

        int tempo = 0;

        double velHorizontalInicial = vel * Math.cos(angRad);
        double velVerticalInicial   = vel * Math.sin(angRad);

        //double tempoVooTotal = (2*velVerticalInicial) / grav;


        //System.out.println(tempoVooTotal);

        System.out.println(Math.sin(2*ang)*((vel*vel)/9.8));

        /*while(true){

            double posicaoHorizontal = velHorizontalInicial * tempo;
            double posicaoVertical   = velVerticalInicial * alt * tempo - 0.5 * grav * tempo * tempo;

            if(tempo > 60) {
                System.out.println("Tempo: "+tempo+ " segundos. | "+tempo/60+" minutos");
            } else {
                System.out.println("Tempo: "+tempo+ " segundos.");
            }

            System.out.println("Posição: "+posicaoVertical + " | "+ posicaoHorizontal);

            if (tempo >= tempoVooTotal){
                break;
            } else {
                tempo += segundosIntervalo;
            }

        }*/

    }

}

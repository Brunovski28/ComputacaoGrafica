package Exercicio_CG02;

import java.util.Scanner;

public class CalcQuedaLivre {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int alt = 0;
// fazer uma coisa, por exemplo, e se ele não sabe a altura
        // perguntar o intervalo de tempo, em metros ou segundos e fazer
        // refatorar
        // testes
        while (true) {

            System.out.println("Informe a altura que o objeto irá cair:");
            alt = entrada.nextInt();

            if(alt < 0) {
                System.out.println("Insira a altura correta!");
            } else {
               break;
            }

        }


        int altCont = 0;

        for (int i = alt; i >= 0; i--) {
            System.out.println("Altura que o objeto está em metros: "+i+" | Velocidade em m/s: "+altCont*9.8);
            altCont++;
        }

    }

}

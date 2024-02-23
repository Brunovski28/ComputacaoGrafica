import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0;

        while (true) {
            System.out.println("Qual numero, de 1 a 10");
            num = entrada.nextInt();

            if (num >= 1 && num <= 10) {
                break;
            }

        }



        for (int i = 0; i <= 10; i++) {
            System.out.println("Numero "+i+ " | "+(num*i));
        }

    }

}

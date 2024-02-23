import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Numero 1");
        int num1 = entrada.nextInt();

        System.out.println("Numero 2");
        int num2 = entrada.nextInt();

        System.out.println("Limite do fibonacci");
        int num3 = entrada.nextInt();

        for (int i = 0; i <= num3; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }

    }

}

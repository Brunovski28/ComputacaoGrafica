import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual temperatura atual?");
        double temp = entrada.nextDouble();

        if (temp > 35) {
            System.out.println("Tem que usar protetor solar!");
        } else {
            System.out.println("Não precisa usar protetor solar!");
        }

    }

}

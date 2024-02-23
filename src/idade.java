import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = entrada.nextInt();

        if (idade > 17) {
            System.out.println("A pessoa é maior de idade");
        } else {
            System.out.println("A pessoa é menor de idade");
        }

    }

}

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ano: ");
        int ano = entrada.nextInt();

        if (ano % 4 == 0){
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

    }
}
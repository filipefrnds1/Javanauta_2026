import java.util.Scanner;

public class EntradaSaidaDeDados {

    public static void main(String[] args) {

        System.out.println("Olá eu faço a impressão e pulo a linha");
        System.out.print("Olá eu faço a impressão na mesma linha");
        System.out.println("Olá eu faço a impressão formatada");

        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Idade: " + idade);

        System.out.print("Digite se você está empregado sim(true) ou não(false): ");
        boolean empregado = sc.nextBoolean();
        System.out.println("Olá, sou " + nome + " tenho " + idade + " estou empregado " + empregado);





    }
}

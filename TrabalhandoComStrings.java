import java.util.Locale;
import java.util.Scanner;

public class TrabalhandoComStrings {

    public static void main(String[] args) { // atalho PSVM

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = "Joana ";
        String nomeDois = "Mateus";
        String sobrenome = "da Silva";

        int tamanhoString = nome.length(); //tamanho da string
        boolean saoIguais = nome.equals(nomeDois); //compara as strings
        String nomeCompleto = nome.concat(sobrenome);


        System.out.println("Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres"); // atalho sout
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);


        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class AulaArray {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10,20,30,50,1};
        String[] frutas;

        frutas = new String[]{"Maçã","Morango","Abacaxi"};

        double[] salarios = new double[5];
        salarios[0] = 500.00;
        salarios[1] = 200.00;
        salarios[2] = 150.00;
        salarios[3] = 25.00;
        salarios[4] = 100.00;

        for(int z = 0; z < salarios.length; z++){

            System.out.println(salarios[z]);
        }

        for(int i = 0; i < salarios.length; i++){

            salarios[i] = sc.nextDouble();
            sc.nextLine();

        }

        for(int j = 0; j < salarios.length; j++){

            System.out.println(salarios[j]);
        }


        System.out.println();

        for(double salario : salarios){
            System.out.println(salario);
        }

         sc.close();

    }

}

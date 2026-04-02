public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean x = true;
        boolean z = true;
        boolean y = false;
        boolean w = false;

        System.out.println(x && z); // verdadeira + verdadeiro
        System.out.println(x && y); // verdadeiro + falso
        System.out.println(y && x); // falso + verdadeiro
        System.out.println(y && w); // falso + falso
        System.out.println();

        System.out.println(x || z); // verdadeira + verdadeiro
        System.out.println(x || y); // verdadeiro + falso
        System.out.println(y || x); // falso + verdadeiro
        System.out.println(y || w);
        System.out.println();

        System.out.println(!x);
        System.out.println(!y);


    }
}

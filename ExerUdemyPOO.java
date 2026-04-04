import java.util.Locale;
import java.util.Scanner;

public class ExerUdemyPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        double pX,pY,areaX,areaY;
        //double xA,xB,xC,yA,yB,yC,pX,pY,areaX,areaY;

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        pX = (x.a+x.b+x.c)/2;
        pY = (y.a+y.b+y.c)/2;
        areaX = Math.sqrt(pX*(pX-x.a)*(pX-x.b)*(pX-x.c));
        areaY = Math.sqrt(pY*(pY-y.a)*(pY-y.b)*(pY-y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }



        sc.close();
    }
}

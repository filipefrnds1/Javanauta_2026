import java.util.Locale;
import java.util.Scanner;

public class ExerUdemyPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA,xB,xC,yA,yB,yC,pX,pY,areaX,areaY;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        pX = (xA+xB+xC)/2;
        pY = (yA+yB+yC)/2;
        areaX = Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));
        areaY = Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));

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

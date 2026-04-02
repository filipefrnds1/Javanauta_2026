public class ConversaoTipos {

    public static void main(String[] args) {

        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int numero2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);

        Long numeroLong = 10L;
        String numeroLongString = numeroLong.toString();

        System.out.println(d);
        System.out.println(numero2);
        System.out.println(numeroInteger + "  " + numeroString);
        System.out.println(numeroDouble + "  " + numeroDoubleString);
        System.out.println(numeroLong + "  " + numeroLongString);
        System.out.println(numeroStringDois + "  " + numeroConvertido);
        System.out.println(numeroStringDois + "  " + numeroConvertidoDouble);
        System.out.println(numeroStringDois + "  " + numeroConvertidoLong);


    }
}

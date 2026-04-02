public class OperadoresAritmeticos {

    public static void main(String[] args) {

        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        System.out.println("Valor Total = R$ " + valorTotal);
        System.out.println("Valor Total com Desconto = R$ " + valorTotalComDesconto);
        System.out.println("Valor Total Dividido = R$ " + valorTotalDividido);
        System.out.println("Valor Total Mensal = R$ " + valorTotalMensal);




    }

}

public class EstruturaIfElse {

    public static void main(String[] args) {

        int idade = 35;

        if (idade >= 18){
            System.out.println("Você é maior de idade");
            System.out.println();
        }
        else{
            System.out.println("Você é menor de idade");
            System.out.println();
        }


        boolean estaChovendo = true;

        if (!estaChovendo){
            System.out.println("Vamos sair para passear");
            System.out.println();
        }
        else{
            System.out.println("Vamos ficar em casa");
            System.out.println();
        }


        boolean temDinheiro = true;
        boolean temCartao = false;

        if(temDinheiro && temCartao){
            System.out.println("Pede um iffor e um zé delivery");
            System.out.println();
        }
        else if(temDinheiro || temCartao){
            System.out.println("Pede um ifood");
            System.out.println();
        }
        else{
            System.out.println("Nã pede nada");
            System.out.println();
        }





    }

}

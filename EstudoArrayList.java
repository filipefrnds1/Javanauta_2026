import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");

        for(String item : listaDeCompras){
            System.out.println(item);
        }

        System.out.println();
        listaDeCompras.add(1,"Banana");

        for(String newItem : listaDeCompras){
            System.out.println(newItem);
        }

        System.out.println();
        String item = listaDeCompras.get(3);

        System.out.println("Na posição 3 eu tenho: " + item);

        listaDeCompras.remove("Sabão em Pó");
        System.out.println();

        for(String againItem : listaDeCompras){
            System.out.println(againItem);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("A lista está vazia ? : " + eVazia + ", qual o tamanho da lista ?  "
                + tamanho + ", a lista contem o item Arroz? " + contem);

        listaDeCompras.forEach(produto -> System.out.println(produto));

        listaDeCompras.clear();
        System.out.println("A lista esta vazia? " + listaDeCompras.isEmpty());



    }

}

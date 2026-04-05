public class Casa {



    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Branco");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);

        casa.alterarCaracteristicas(100,2,2,"madeira");

        PlantaCasa casaVizinho = new PlantaCasa();

        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();
        casaVizinho.pintar();

    }
}

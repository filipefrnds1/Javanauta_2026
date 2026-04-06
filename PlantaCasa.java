public class PlantaCasa implements Construcao{

    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    // public - pode ser acessado por qualquer classe
    // private - pode ser acessado apenas na própria classe
    // protected - pode ser acessado apenas no mesmo pacote/pasta

    // anotação Override informa que o metodo vem de uma interface
    @Override
    public void construir(){
        System.out.println("A casa foi construida, as caracteristicas são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de Quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void mudarCorParede(String novaCor){
        cor=novaCor;
        pintar();
    }

    @Override
    public void pintar(){
        System.out.println("A casa foi pintada de " + cor);
    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();
    }
}

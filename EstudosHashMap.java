import java.util.HashMap;
import java.util.Map;

public class EstudosHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.5); // obs: Nome é a chave, nota é o valor
        notasAlunos.put("Matheus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for(String aluno : notasAlunos.keySet()){ //keyset pega apenas a chave
            double nota = notasAlunos.get(aluno); //get pega o valor associado a chave
            System.out.println(aluno + " : " + nota);
        }

        double nota = notasAlunos.get("Alice");
        System.out.println("A nota da Alice é : " + nota);

        for(Map.Entry<String, Double> entry : notasAlunos.entrySet()){
            String nome = entry.getKey();
            double valorNota = entry.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        int tamanhoHash = notasAlunos.size();
        System.out.println(tamanhoHash);

        notasAlunos.remove("Maria");

        for(Map.Entry<String, Double> entry : notasAlunos.entrySet()){
            String nome = entry.getKey();
            double valorNota = entry.getValue();
            System.out.println(nome + " : " + valorNota);
        }

    }
}

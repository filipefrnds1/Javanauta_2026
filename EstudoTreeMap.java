import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAluno = new TreeMap<>();
        notasAluno.put("Matheus", 8.5);
        notasAluno.put("Maria", 9.0);
        notasAluno.put("Aline", 10.0);

        for(Map.Entry<String, Double> entry : notasAluno.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Primeira chave: " + notasAluno.firstKey());
        System.out.println("Ultima chave: " + notasAluno.lastKey());
    }
}

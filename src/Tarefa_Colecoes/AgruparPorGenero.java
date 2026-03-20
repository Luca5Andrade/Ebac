package Tarefa_Colecoes;

import java.util.*;

public class AgruparPorGenero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes e sexo separados por virgula (ex: Ana-F, Lucas-M): ");
        String input = s.nextLine();

        String[] entradas = input.split(",");

        Map<String, List<String>> grupos = new HashMap<>();

        for (String entrada : entradas){
            String[] partes = entrada.split("-");
            if(partes.length == 2){
                String nome = partes[0].trim();
                String genero = partes[1].trim();

                grupos.putIfAbsent(genero, new ArrayList<>());
                grupos.get(genero).add(nome);
            }
        }

        for (List<String> lista : grupos.values()){
            Collections.sort(lista);
        }

        System.out.println("Nomes agrupados por genero: ");
        for (Map.Entry<String, List<String>> entry : grupos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

package Tarefa_Colecoes;

import java.util.*;

public class OrdenarNomes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separados por virgula: ");
        String input = s.nextLine();
        String[] nomes = input.split(",");

        List<String> listaNomes = new ArrayList<>();
        for (String nome : nomes){
            listaNomes.add(nome.trim());
        }

        Collections.sort(listaNomes);

        System.out.println("Nomes em ordem alfabetica: ");
        for (String nome : listaNomes){
            System.out.print(nome +" ");
        }
    }
}

package Tarefa_ControleFluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 1;
        double[] notas = {1, 2,3,4};

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a " + n + "º nota: ");
            notas[i] = s.nextDouble();
            n++;
        }

        double media = (notas[0]+notas[1]+notas[2]+notas[3]) / 4;

        if(media >= 7){
            System.out.println("Aprovado, sua media foi: " + media);
        }else if(media > 5){
            System.out.println("Ficou de exame, sua media foi: " + media);
        }else{
            System.out.println("Reprovado, dua media foi: " + media);
        }
    }
}

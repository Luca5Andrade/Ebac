package media;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite a Primeira nota: ");
        Double n1 = s.nextDouble();
        System.out.printf("Digite a Segunda nota: ");
        Double n2 = s.nextDouble();
        System.out.printf("Digite a Terceira nota: ");
        Double n3 = s.nextDouble();
        System.out.printf("Digite a Quarta nota: ");
        Double n4 = s.nextDouble();

        Double media = (n1+n2+n3+n4) / 4;

        if(media >= 7){
            System.out.println("Aprovado, sua media foi: " + media);
        }else if(media > 5 && media < 7){
            System.out.println("Ficou de exame, sua media foi: " + media);
        }else{
            System.out.println("Reprovado, dua media foi: " + media);
        }
    }
}

package ParImpar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resposta;

        do {
            int n = 1;
            int[] numVetor = new int[5];
            Boolean PAR = false;

            for (int i = 0; i < 5; i++) {
                System.out.printf("Digite a " + n + "º numero: ");
                numVetor[i] = s.nextInt();
                n++;
            }

            for (int id = 0; id < numVetor.length; id++) {
                if (numVetor[id] % 2 == 0) {
                    System.out.printf("Par: " + numVetor[id] + ". ");
                    PAR = true;
                }
            }

            if (!PAR) {
                System.out.print("Ne  nhum numero par");
            }

            System.out.println("\nDeseja utilizar novamente? (s/n)");
            resposta = s.next();

        }while (resposta.equals("s"));
            System.out.println("Finalizando programa...");
            s.close();
    }
}

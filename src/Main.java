import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FernFlower fernFlower = new FernFlower();
        Scanner input = new Scanner(System.in);
        boolean complete = false;

        System.out.println("Entradas Flor:");
        System.out.println("R1 deve ser no mínimo 1.");
        System.out.println("X1 e Y1: Coordenadas do centro do círculo desenhado pelo caçador no plano cartesiano.");
        System.out.println("R2 deve ser no máximo 1000.");
        System.out.println("X2 e Y2: Coordenadas do centro do círculo da flor no plano cartesiano.");
        System.out.println("Digite 'sair' para encerrar!");

        while (!complete) {
            System.out.print("Digite o valor de R1 (ou 'sair' para encerrar): ");
            String inputR1 = input.next();
            if (inputR1.equalsIgnoreCase("sair")) {
                complete = true;
                break;
            }

            System.out.print("Digite o valor de X1: ");
            int x1 = input.nextInt();

            System.out.print("Digite o valor de Y1: ");
            int y1 = input.nextInt();

            System.out.print("Digite o valor de R2: ");
            int r2 = input.nextInt();

            System.out.print("Digite o valor de X2: ");
            int x2 = input.nextInt();

            System.out.print("Digite o valor de Y2: ");
            int y2 = input.nextInt();

            // Converta o valor de R1 da entrada para inteiro
            int r1 = Integer.parseInt(inputR1);

            // Chame o método tentativaDesenhar
            String resultado = fernFlower.tentativaDesenhar(r1, x1, y1, r2, x2, y2);
            System.out.println("Resultado: " + resultado);

            System.out.println("\nDeseja continuar? (s/n)");
            String continuar = input.next();
            if (continuar.equalsIgnoreCase("n")) {
                complete = true;
            }
        }

        input.close();
        System.out.println("Programa encerrado.");
    }
}
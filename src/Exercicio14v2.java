import java.util.Scanner;

public class Exercicio14v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double y = 0;
        int sinal = 1;

        System.out.println("Informe o valor de n : ");
        n = in.nextInt();
        for(int d = 1; d <= n; d++) {
        y = y + (double)1/d * sinal;
        sinal = sinal * -1;

        }
        System.out.println("y = " + y);


    }
}

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double y = 0;

        System.out.println("Informe o valor de n : ");
        n = in.nextInt();
        for(int d = 1; d <= n; d++) {
            if(d % 2==0){
                y = y - (double)1/d;
            }
            else {
                y = y + (double) 1 / d;
            }
        }
        System.out.println("y = " + y);


    }
}

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        int x = 1, y = 1, z;
        int cont;

        System.out.print("Qual a quantidade de números? ");
        quantidade = sc.nextInt();
        if(quantidade == 1) {
            System.out.print(x);
        }
        else if(quantidade == 2) {
            System.out.print(x + " " + y);
        }
        else {
            System.out.print(x + " " + y + " ");
            cont = 3;
            while(cont <= quantidade) {
                z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
                cont++;
            }
        }


    }
}

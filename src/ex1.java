import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        System.out.println("Digite o primeiro valor : ");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor : (tem q ser maior que o primeiro)");
        valor2 = sc.nextInt();
        if(valor2 > valor1){
            while (valor1 <= valor2) {
                System.out.println(valor1 + "");
                //valor1 = valor1 +1;
                valor1++;
            }
        }
        else {
            System.out.println("O segundo valor tinha que ser maior que o primeiro");
        }

    }
}

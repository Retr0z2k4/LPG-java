import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        System.out.print("Informe um valor inteiro e positivo --> ");
        valor = in.nextInt();
        if(valor <= 0) {
            System.out.println("Valor inválido! Deve ser inteiro e positivo");
        }
        else {
            for(int cont = 1; cont <= valor; cont++) {
                if(valor % cont == 0) {
                    System.out.print(cont + "  ");
                }
            }
        }
    }
}

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor,total = 0;

        System.out.print("Informe um valor inteiro e positivo --> ");
        valor = in.nextInt();
        if(valor <= 0) {
            System.out.println("Valor inválido! Deve ser inteiro e positivo");
        }
        else {
            for(int cont = 1; cont <= valor; cont++) {
                if(valor % cont == 0) {
                    total++; //total recebe = total + 1
                }
            }
            if(total ==2){
                System.out.println("O numero é primo");
            }
            else {
                System.out.println("O numero não é primo");
            }
        }
    }
}

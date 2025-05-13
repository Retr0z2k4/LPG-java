import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int maior =0;
        int contador =1;

        while (contador <= 10){
            System.out.println("Digite um valor");
            valor = sc.nextInt();
            if(valor > maior) {
                maior = valor;
                contador++;
            }
            System.out.println("maior = " +maior);
        }
    }
}

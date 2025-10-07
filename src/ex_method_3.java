import java.util.Scanner;

public class ex_method_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valor2, resultado;
        System.out.println("Valor 1 =");
        valor = sc.nextInt();
        System.out.println("valor 2=");
        valor2 = sc.nextInt();

        somar(valor, valor2);
    }
    public static void somar(int valor, int valor2){
        int resultado;
        resultado = valor + valor2;
        System.out.println(resultado);
    }
}

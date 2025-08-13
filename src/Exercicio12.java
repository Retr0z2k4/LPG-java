import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        Scanner in = new Scanner(System.in);
        int totalDeProdutos, tipo;
        double totalDaCompra = 0;

        System.out.print("Informe o total de produtos --> ");
        totalDeProdutos = in.nextInt();

        for(int cont = 1; cont <= totalDeProdutos; cont++) {
            System.out.print("Preço do produto " + cont + " --> ");
            totalDaCompra = totalDaCompra + in.nextDouble();
        }
        System.out.println("\nTotal da compra R$ " + formato.format(totalDaCompra));
        System.out.println("Digite:\n1 para pagamento à vista ou\n2 para pagamento parcelado");
        tipo = in.nextInt();

        switch(tipo) {
            case 1 -> totalDaCompra = totalDaCompra * 0.9;
            case 2 -> totalDaCompra = totalDaCompra * 1.155;
        }

        System.out.println("\nTotal final da compra R$ " + formato.format(totalDaCompra));
    }

}

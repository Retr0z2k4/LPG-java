import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdContribuinte;
        double salarioMinimo;
        String cpf;
        int qtdDependente;
        double renda;
        double imposto;
        double desconto;

        System.out.print("Total de contribuintes --> ");
        qtdContribuinte = sc.nextInt();
        System.out.print("Salário mínimo atual --> R$ ");
        salarioMinimo = sc.nextDouble();

        while(qtdContribuinte >= 1) {
            System.out.print("CPF --> ");
            cpf = sc.next();
            System.out.print("Total de dependentes --> ");
            qtdDependente = sc.nextInt();
            System.out.print("Renda mensal --> R$ ");
            renda = sc.nextDouble();

            desconto = salarioMinimo * 0.05 * qtdDependente;
            renda = renda - desconto;

            if(renda <= 2 * salarioMinimo) {
                imposto = 0;
            }
            else if(renda <= 3 * salarioMinimo) {
                imposto = renda * 5 / 100;
            }
            else if(renda <= 5 * salarioMinimo) {
                imposto = renda * 10 / 100;
            }
            else if(renda <= 7 * salarioMinimo) {
                imposto = renda * 15 / 100;
            }
            else {
                imposto = renda * 20 / 100;
            }
            System.out.println("IR --> R$ " + imposto);
            qtdContribuinte--;
        }

    }
}

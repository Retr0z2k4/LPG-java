import java.util.Scanner;

public class DespesasEmpresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Ler quantidade de setores e meses
        System.out.print("Digite o número de setores (R): ");
        int R = sc.nextInt();

        System.out.print("Digite o número de meses (C): ");
        int C = sc.nextInt();

        double[][] matriz = new double[R][C];

        // b) Ler matriz de gastos
        System.out.println("\nDigite os valores dos gastos:");
        preencherMatriz(matriz, sc);

        // c) Ler limite de gasto
        System.out.print("\nDigite o limite máximo de gasto por setor: ");
        double limite = sc.nextDouble();

        // d) Cálculo dos totais
        double[] totalSetores = calcularTotalPorSetor(matriz);
        double[] totalMeses = calcularTotalPorMes(matriz);

        // e) Identificar maior setor e maior mês
        int setorMaior = identificarSetorMaior(totalSetores);
        int mesMaior = identificarMesMaior(totalMeses);

        // f) Gerar relatório final
        gerarRelatorio(totalSetores, totalMeses, setorMaior, mesMaior, limite);
    }

    // Método para preencher a matriz com valores digitados pelo usuário
    public static void preencherMatriz(double[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            System.out.println("\n--- Setor " + (i + 1) + " ---");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("Gasto do mês " + (j + 1) + ": ");
                m[i][j] = sc.nextDouble();
            }
        }
    }

    // Total por setor
    public static double[] calcularTotalPorSetor(double[][] m) {
        double[] total = new double[m.length];

        for (int i = 0; i < m.length; i++) {
            double soma = 0;
            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
            }
            total[i] = soma;
        }

        return total;
    }

    // Total por mês
    public static double[] calcularTotalPorMes(double[][] m) {
        double[] total = new double[m[0].length];

        for (int j = 0; j < m[0].length; j++) {
            double soma = 0;
            for (int i = 0; i < m.length; i++) {
                soma += m[i][j];
            }
            total[j] = soma;
        }

        return total;
    }

    // Encontrar setor que mais gastou
    public static int identificarSetorMaior(double[] totalSetores) {
        int indiceMaior = 0;
        for (int i = 1; i < totalSetores.length; i++) {
            if (totalSetores[i] > totalSetores[indiceMaior]) {
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }

    // Encontrar mês com maior gasto geral
    public static int identificarMesMaior(double[] totalMeses) {
        int indiceMaior = 0;
        for (int i = 1; i < totalMeses.length; i++) {
            if (totalMeses[i] > totalMeses[indiceMaior]) {
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }

    // Geração do relatório final
    public static void gerarRelatorio(
        double[] totalSetores,
        double[] totalMeses,
        int setorMaior,
        int mesMaior,
        double limite
    ) {
        System.out.println("\n===== RELATÓRIO DE DESPESAS =====");

        // Total por setor
        System.out.println("\nTotal gasto por setor:");
        for (int i = 0; i < totalSetores.length; i++) {
            System.out.printf("Setor %d: R$ %.2f\n", (i + 1), totalSetores[i]);
        }

        // Mês mais caro
        System.out.printf("\nMês com maior gasto geral: Mês %d (Total: R$ %.2f)\n",
                (mesMaior + 1), totalMeses[mesMaior]);

        // Setor mais caro
        System.out.printf("Setor que mais gastou: Setor %d (Total: R$ %.2f)\n",
                (setorMaior + 1), totalSetores[setorMaior]);

        // Alertas de limite
        System.out.println("\nSetores que ultrapassaram o limite:");
        boolean algum = false;

        for (int i = 0; i < totalSetores.length; i++) {
            if (totalSetores[i] > limite) {
                System.out.printf("⚠ Setor %d ultrapassou o limite! Total: R$ %.2f\n",
                        (i + 1), totalSetores[i]);
                algum = true;
            }
        }

        if (!algum) {
            System.out.println("Nenhum setor ultrapassou o limite.");
        }

        System.out.println("\n===== FIM DO RELATÓRIO =====");
    }
}

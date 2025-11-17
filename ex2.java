import java.util.Scanner; // importa Scanner para ler entrada do usuário
import java.util.Random;  // importa Random para gerar números aleatórios

public class MapaTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria Scanner para leitura do teclado

        // a) Ler R e C
        System.out.print("Digite o número de linhas (R): "); // solicita número de linhas
        int R = sc.nextInt(); // lê o número de linhas como inteiro

        System.out.print("Digite o número de colunas (C): "); // solicita número de colunas
        int C = sc.nextInt(); // lê o número de colunas como inteiro

        double[][] matriz = new double[R][C]; // cria matriz R x C para armazenar temperaturas

        // b) Preencher com valores aleatórios entre -50 e 70
        preencherMatriz(matriz); // chama método que preenche a matriz com números aleatórios

        // Imprimir a matriz para conferência
        System.out.println("\nMatriz de Temperaturas (°C):"); // cabeçalho para a impressão da matriz
        imprimirMatriz(matriz); // imprime a matriz com duas casas decimais

        // c) Calcular média geral
        double media = calcularMedia(matriz); // calcula a média de todos os valores da matriz
        System.out.printf("\nTemperatura média geral: %.2f°C\n", media); // imprime a média com 2 casas

        // d) Gerar matriz de alerta (1 = acima da média, 0 = <= média)
        int[][] alerta = gerarMatrizAlerta(matriz, media); // cria matriz de alerta baseada na média

        // Imprimir matriz de alerta
        System.out.println("\nMatriz de Alerta (1 = acima da média / 0 = na média ou abaixo):"); // cabeçalho
        imprimirMatrizInteiros(alerta); // imprime a matriz de 0/1
    }

    // Método para preencher a matriz com valores aleatórios entre -50 e 70
    public static void preencherMatriz(double[][] m) {
        Random rand = new Random(); // cria gerador de números aleatórios
        for (int i = 0; i < m.length; i++) { // percorre as linhas da matriz
            for (int j = 0; j < m[0].length; j++) { // percorre as colunas da matriz
                // gera valor entre -50 (inclusive) e 70 (aprox). -50 + rand.nextDouble()*120
                m[i][j] = -50 + rand.nextDouble() * (70 - (-50)); 
            }
        }
    }

    // Método para imprimir matriz de double com duas casas decimais
    public static void imprimirMatriz(double[][] m) {
        for (int i = 0; i < m.length; i++) { // para cada linha
            for (int j = 0; j < m[0].length; j++) { // para cada coluna
                System.out.printf("%7.2f ", m[i][j]); // imprime o valor com 2 casas e espaçamento
            }
            System.out.println(); // pula para a próxima linha após imprimir todas as colunas
        }
    }

    // Calcular média de todos os elementos da matriz
    public static double calcularMedia(double[][] m) {
        double soma = 0; // acumula a soma das temperaturas
        int total = m.length * m[0].length; // calcula o total de elementos da matriz

        for (int i = 0; i < m.length; i++) { // percorre as linhas
            for (int j = 0; j < m[0].length; j++) { // percorre as colunas
                soma += m[i][j]; // adiciona cada elemento à soma
            }
        }
        return soma / total; // retorna a média aritmética
    }

    // Gerar matriz de alerta: 1 se acima da média, 0 se na média ou abaixo
    public static int[][] gerarMatrizAlerta(double[][] m, double media) {
        int[][] alerta = new int[m.length][m[0].length]; // cria matriz de inteiros para alertas

        for (int i = 0; i < m.length; i++) { // percorre linhas
            for (int j = 0; j < m[0].length; j++) { // percorre colunas
                if (m[i][j] > media) { // verifica se o valor está acima da média
                    alerta[i][j] = 1; // marca 1 quando acima
                } else {
                    alerta[i][j] = 0; // marca 0 quando igual ou abaixo da média
                }
            }
        }
        return alerta; // retorna a matriz de alerta
    }

    // Imprimir matriz de inteiros (0/1)
    public static void imprimirMatrizInteiros(int[][] m) {
        for (int i = 0; i < m.length; i++) { // percorre linhas
            for (int j = 0; j < m[0].length; j++) { // percorre colunas
                System.out.print("  " + m[i][j] + "  "); // imprime cada elemento com espaçamento
            }
            System.out.println(); // nova linha após cada linha impressa
        }
    }
}

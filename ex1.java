import java.util.Scanner;

public class ComparadorDNA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Ler entradas
        System.out.print("Digite a sequência do suposto pai: ");
        String pai = sc.nextLine();

        System.out.print("Digite a sequência do filho: ");
        String filho = sc.nextLine();

        // b) Normalizar (tornar tudo maiúsculo)
        pai = normalizar(pai);
        filho = normalizar(filho);

        // c) Validações
        if (!sequenciaValida(pai)) {
            System.out.println("Erro: A sequência do pai contém caracteres inválidos. Use apenas A, C, G e T.");
            return;
        }

        if (!sequenciaValida(filho)) {
            System.out.println("Erro: A sequência do filho contém caracteres inválidos. Use apenas A, C, G e T.");
            return;
        }

        if (!tamanhosIguais(pai, filho)) {
            System.out.println("Erro: As sequências possuem tamanhos diferentes.");
            return;
        }

        // e) Comparação posição a posição
        compararSequencias(pai, filho);
    }

    // Método para normalizar
    public static String normalizar(String s) {
        return s.toUpperCase().trim();
    }

    // Valida se contém apenas A, C, G, T
    public static boolean sequenciaValida(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                return false;
            }
        }
        return true;
    }

    // Verifica tamanhos
    public static boolean tamanhosIguais(String s1, String s2) {
        return s1.length() == s2.length();
    }

    // Compara posição a posição
    public static void compararSequencias(String pai, String filho) {
        int total = pai.length();
        int iguais = 0;

        for (int i = 0; i < total; i++) {
            if (pai.charAt(i) == filho.charAt(i)) {
                iguais++;
            }
        }

        int diferentes = total - iguais;
        double similaridade = ((double) iguais / total) * 100;

        if (diferentes == 0) {
            System.out.println("As sequências são idênticas!");
        } else {
            System.out.println("As sequências NÃO são idênticas.");
            System.out.println("Genes diferentes: " + diferentes);
        }

        System.out.printf("Similaridade: %.2f%%\n", similaridade);
    }
}

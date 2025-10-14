import java.util.Scanner;

public class ex_method4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;
        double[] raiz;

        System.out.println("a -->" );
        a = sc.nextInt();
        if ( a == 0){
            System.out.println("Não é uma equação do 2°grau");
        }
        else {
            System.out.println("b -->");
            b = sc.nextInt();
            System.out.println("c -->");
            c = sc.nextInt();
            delta = calcularDelta(a, b,c );
            if (delta < 0) {
                System.out.println("A equação não tem raiz real");
            }

            else {
                raiz = calcularRaiz(a, b, delta);
                System.out.println();
            }
        }

    }

    public static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double[] calcularRaiz(double a, double b, double delta) {
        double[] raiz = new double[2];
        raiz[0] = (-b + Math.sqrt(delta)) / (2*a);
        raiz[1] = (-b - Math.sqrt(delta)) / (2*a);
        return raiz;
    }
}

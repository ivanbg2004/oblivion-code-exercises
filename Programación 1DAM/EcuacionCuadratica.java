import java.util.Scanner;

/**
 * Clase para resolver ecuaciones cuadráticas.
 * Calcula las raíces de una ecuación de la forma ax^2 + bx + c = 0.
 * @author Tu Nombre
 * @version 2.0
 */
public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Coeficiente a: ");
            double a = sc.nextDouble();
            System.out.print("Coeficiente b: ");
            double b = sc.nextDouble();
            System.out.print("Coeficiente c: ");
            double c = sc.nextDouble();

            if (a == 0) {
                System.out.println("No es una ecuación de segundo grado.");
                return;
            }

            double discriminante = b * b - 4 * a * c;
            if (discriminante < 0) {
                System.out.println("No hay soluciones reales.");
            } else {
                double raiz = Math.sqrt(discriminante);
                double x1 = (-b + raiz) / (2 * a);
                double x2 = (-b - raiz) / (2 * a);
                System.out.println("Soluciones: x1 = " + x1 + ", x2 = " + x2);
            }
        } catch (Exception e) {
            System.out.println("Error en entrada: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

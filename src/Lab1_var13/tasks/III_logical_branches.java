package Lab1_var13.tasks;
import java.util.Scanner;

public class III_logical_branches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = sc.nextDouble();

        // Вычисление Y
        double y;
        if (x <= 0) {
            y = 1 - Math.pow(9, x + 1);
        } else if (x > 0 && x <= 3) {
            y = 1 + Math.pow(3, x);
        } else { // x > 3
            y = 1 / Math.tan(2 * x + 1);
        }

        // Вычисление F
        double f;
        if (x <= 0) {
            f = Math.exp(Math.tan(2 * x + 1));
        } else if (x > 0 && x <= 3) {
            f = Math.pow(x, 2) - Math.pow(Math.sin(x), 4);
        } else { // x > 3
            f = Math.pow(Math.pow(x, 2), (0.2));
        }

        System.out.println("Y = " + y);
        System.out.println("F = " + f);

        sc.close();
    }
}

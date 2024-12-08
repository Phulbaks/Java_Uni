package var13;
import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число x: ");
        double x = sc.nextDouble();

        System.out.print("Введите второе число y: ");
        double y = sc.nextDouble();

        double lesser = Math.min(x, y);

        if (lesser < 0) {
            System.out.println("Нельзя извлечь корень из отрицательного числа");
        } else {
            double result = Math.sqrt(lesser);

            System.out.println("Квадратный корень из " + lesser + ": " + result);
        }
        sc.close();
    }
}

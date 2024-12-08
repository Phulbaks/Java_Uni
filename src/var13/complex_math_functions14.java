package var13;
import java.util.Scanner;

public class complex_math_functions14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число a: ");
        double a = sc.nextDouble();

        System.out.print("Введите второе число b: ");
        double b = sc.nextDouble();

        double max = Math.max(a, b);

        double d = Math.tan(max);

        System.out.println("Наибольшее число: " + max);
        System.out.println("Тангенс наибольшего числа d: " + d);

        sc.close();
    }
}

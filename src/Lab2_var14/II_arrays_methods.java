package Lab2_var14;
import java.util.Scanner;

public class II_arrays_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            return;
        }

        double[] b = new double[n];
        System.out.println("Введите элементы массива b:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextDouble();
        }

        double[] c = new double[n]; // максимально возможный размер n
        int cIndex = 0; // счётчик индексов для размера нового массива

        for (int i = 0; i < n; i++) {
            if (b[i] > 0) {
                c[cIndex] = Math.sqrt(b[i]);
                cIndex++;
            }
        }

        double[] compressed_c = new double[cIndex];
        for (int i = 0; i < cIndex; i++) {
            compressed_c[i] = c[i];
        }

        // Сортировка массива
        for (int i = 0; i < compressed_c.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < compressed_c.length; j++) {
                if (compressed_c[j] < compressed_c[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем местами текущий элемент и минимальный
            double temp = compressed_c[i];
            compressed_c[i] = compressed_c[minIndex];
            compressed_c[minIndex] = temp;
        }

        System.out.print("Массив C:");
        for (int i = 0; i < compressed_c.length; i++) {
            System.out.print(" " + compressed_c[i]);
        }
    }
}

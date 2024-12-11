package Lab2_var14;
import java.util.Random;
import java.util.Scanner;

public class III_matrixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int m = sc.nextInt();

        System.out.print("Введите количество столбцов: ");
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Количество строк и столбцов должно быть больше 0");
            return;
        }

        int[][] matrix = new int[m][n];
        Random random = new Random();

        System.out.println("Сгенерированная матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // генерация случайных чисел в диапазоне он -100 до 100
                matrix[i][j] = random.nextInt(201) - 100;
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        // Создаем вектор B
        double[] B = new double[n];

        for (int j = 0; j < n; j++) {
            int positiveSum = 0;
            int positiveCount = 0;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > 0) {
                    positiveSum += matrix[i][j];
                    positiveCount++;
                }
            }
            // среднее арифметическое положительных чиесл
            if (positiveCount > 0) {
                B[j] = (double) positiveSum / positiveCount;
            } else {
                B[j] = 0;
            }
        }
        System.out.print("Вектор B: ");
        for (double value : B) {
            System.out.print(value + "  ");
        }
    }
}

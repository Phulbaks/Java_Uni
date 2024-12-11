package Lab2_var14;
import java.util.Random;
import java.util.Scanner;

public class IV_matrixes_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = sc.nextInt(); // Размер матрицы
        int[][] matrix = new int[n][n];
        Random random = new Random();

        // Заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(20) - 10; // Числа от -10 до 9
            }
        }

        // Вывод матрицы
        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int sum = 0;
        int count = 0; // количество элементов
        int[] array = new int[n-1]; // элементы диагонали параллельной побочной

        System.out.println("Элементы диагонали параллельной побочной:");
        for (int i = 1; i < n; i++) { // Начиная со второй строки
            int j = n - i; // Столбец под побочной диагональю
            System.out.println(matrix[i][j]);

            // сумма положительных элементов
            if (matrix[i][j] > 0) {
                sum += matrix[i][j];
            }
            else {
                sum += 0;
            }
            array[count] = matrix[i][j];
            count++;
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Количество элементов: " + count);
        System.out.println("Элементы побочной диагонали умноженные на количество: ");
        for (int value : array) {
            System.out.println(value * count);
        }

    }
}

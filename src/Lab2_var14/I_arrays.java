package Lab2_var14;
import java.util.Scanner;

public class I_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();


        if (n <= 0) {
            System.out.println("Размер массива должен быть больше 0");
            return;
        }

        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int zeroIndex = -1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                zeroIndex = i;
                // Сумма элементов после 0
                for (int j = i + 1; j < n; j++) {
                    sum += array[j];
                }
                break;
            }
        }

        // проверка есть ли в массиве 0
        if (zeroIndex == -1) {
            System.out.println("Нулевой элемент в массиве не найден.");
        } else {
            System.out.println("Нулевой элемент находится на " + (zeroIndex + 1) + " позиции");
            System.out.println("Сумма элементов после нуля: " + sum);
        }
        sc.close();
    }
}

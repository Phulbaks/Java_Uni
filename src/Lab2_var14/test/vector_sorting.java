package Lab2_var14.test;
import java.util.Arrays;
import java.util.Random;

public class vector_sorting {
    public static void main(String[] args) {
        int size = 30; // Размер вектора
        int[] vector = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(101) + 100; // Числа от 100 до 200
        }

        System.out.print("Оригинальный вектор: ");
        System.out.println(Arrays.toString(vector));

        Arrays.sort(vector);
        System.out.print("Отсортированный вектор: ");
        System.out.println(Arrays.toString(vector));
    }
}

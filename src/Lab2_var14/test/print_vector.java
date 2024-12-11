package Lab2_var14.test;
import java.util.Arrays;

public class print_vector {
    public static void main(String[] args) {
        int[] array = {1, 2, -4, 4, 0};
        printVector1(array, "Элемент: ");
        printVector2(array, "Элемент: ");
    }

    public static void printVector1(int[] vector, String message) {
        System.out.println(message + Arrays.toString(vector));
    }

    public static void printVector2(int[] vector, String message) {
        for (int value : vector) {
            System.out.println(message + value);
        }
    }
}

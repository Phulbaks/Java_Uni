package Lab2_var14.test;
import java.util.Arrays;
import java.util.Random;

public class fill_vector {
    public static void main(String[] args) {
        int[] vector = fillRandomIntVector(15, -5, 19);

        System.out.println(Arrays.toString(vector));
    }

    public static int[] fillRandomIntVector (int size, int min, int max){
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(max - min + 1) + min;
        }

        return vector;
    }
}
